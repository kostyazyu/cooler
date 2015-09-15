package com.kostyazyu.cooler.dao;

import com.kostyazyu.cooler.model.user.User;

import java.util.List;

public interface UserDao {

        User save(User user);

        // false if not found
        boolean delete(int id);

        // null if not found
        User get(int id);

        // null if not found
        User getByEmail(String email);

        List<User> getAll();
}
