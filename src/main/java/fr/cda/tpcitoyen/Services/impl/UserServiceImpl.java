package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Entities.User;
import fr.cda.tpcitoyen.Repositories.UserRepository;
import fr.cda.tpcitoyen.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Utilisateur introuvable pour l'id : " + id
                )
        );
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
