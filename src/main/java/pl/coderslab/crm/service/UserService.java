package pl.coderslab.crm.service;

import pl.coderslab.crm.entity.User;

import java.util.List;

public interface UserService {

    User findByUserName(String username);

    void saveUser(User user);

    List<User> findAllUsers();
}
