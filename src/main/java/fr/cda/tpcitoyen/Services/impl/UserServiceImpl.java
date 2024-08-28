package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Repositories.UserRepository;
import fr.cda.tpcitoyen.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
}
