package fr.cda.tpcitoyen.Services;

import fr.cda.tpcitoyen.Entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(Integer id);
    User addUser(User user);
}
