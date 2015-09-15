package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.dao.UserDao;
import com.kostyazyu.cooler.model.user.User;
import com.kostyazyu.cooler.service.UserService;
import com.kostyazyu.cooler.util.NotFoundException;
import com.kostyazyu.cooler.util.exception.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        ExceptionUtil.check(userDao.delete(id), id);
    }

    @Override
    public User get(int id) throws NotFoundException {
        return ExceptionUtil.check(userDao.get(id), id);
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return ExceptionUtil.check(userDao.getByEmail(email), "email " + email);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void update(User user) throws NotFoundException {
        ExceptionUtil.check(userDao.save(user), user.getId());
    }
}
