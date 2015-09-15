package com.kostyazyu.cooler.service;

import com.kostyazyu.cooler.model.user.User;
import com.kostyazyu.cooler.util.NotFoundException;

import java.util.List;

public interface UserService {

    User save(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    List<User> getAll();

    void update(User user) throws NotFoundException;
}
