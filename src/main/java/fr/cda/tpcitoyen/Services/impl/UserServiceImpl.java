package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Entities.User;
import fr.cda.tpcitoyen.Repositories.UserRepository;
import fr.cda.tpcitoyen.Security.RoleType;
import fr.cda.tpcitoyen.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(Integer id) {
        return this.userRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Utilisateur introuvable pour l'id : " + id
                )
        );
    }

    public User register(User user) {

        String hashedPassword = this.bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);

        user.setRole(RoleType.USER);

        return this.userRepository.save(user);
    }

    public User updateUser(User user, Integer id) {
        this.getUser(id);
        user.setId(id);
        return this.userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        this.getUser(id);
        this.userRepository.deleteById(id);
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepository.findByMail(username).orElseThrow(
                () -> new UsernameNotFoundException(
                        "Utilisateur introuvable pour le mail : " + username
                )
        );
    }
}
