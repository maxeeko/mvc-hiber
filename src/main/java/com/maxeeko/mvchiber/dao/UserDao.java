package com.maxeeko.mvchiber.dao;

import com.maxeeko.mvchiber.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void createUser(User user);

    User getUserById(int id);

    void deleteUser(int id);

    void updateUser(int id, User user);
}
