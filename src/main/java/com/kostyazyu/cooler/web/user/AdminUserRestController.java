package com.kostyazyu.cooler.web.user;

import com.kostyazyu.cooler.LoggerWrapper;
import com.kostyazyu.cooler.model.user.User;
import com.kostyazyu.cooler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AdminUserRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(AdminUserRestController.class);

    @Autowired
    private UserService userService;

    public List<User> getAll() {
        LOG.info("getAll");
        return userService.getAll();
    }

    public User get(int id) {
        LOG.info("get " + id);
        return userService.get(id);
    }

    public User create(User user) {
        LOG.info("create " + user);
        return userService.save(user);
    }

    public void delete(int id) {
        LOG.info("delete " + id);
        userService.delete(id);
    }

    public void update(User user) {
        LOG.info("update " + user);
        userService.update(user);
    }

    public User getByEmail(String email) {
        LOG.info("getByEmail " + email);
        return userService.getByEmail(email);
    }
}
