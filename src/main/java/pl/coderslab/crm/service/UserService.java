package pl.coderslab.crm.service;

import pl.coderslab.crm.entity.User;

public interface UserService {

    User findByUserName(String username);

    void saveUser(User user);
}
