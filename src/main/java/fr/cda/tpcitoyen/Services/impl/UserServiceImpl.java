package fr.cda.tpcitoyen.Services.impl;

import fr.cda.tpcitoyen.Repositories.UserRepository;
import fr.cda.tpcitoyen.Services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

}
