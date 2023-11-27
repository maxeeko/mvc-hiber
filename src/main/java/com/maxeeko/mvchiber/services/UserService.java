package com.maxeeko.mvchiber.services;

import com.maxeeko.mvchiber.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void createUser(User user);

    User getUserById(int id);

    void deleteUser(int id);

    void updateUser(int id, User user);
}
