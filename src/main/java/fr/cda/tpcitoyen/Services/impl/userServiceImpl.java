package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Entities.user;
import fr.cda.tpcitoyen.Repositories.userRepository;
import fr.cda.tpcitoyen.Services.userService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    private final userRepository repo;

    public userServiceImpl(userRepository repo) {
        this.repo = repo;
    }

}
