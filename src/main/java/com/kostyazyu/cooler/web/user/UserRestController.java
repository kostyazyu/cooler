package com.kostyazyu.cooler.web.user;

import com.kostyazyu.cooler.LoggedUser;
import com.kostyazyu.cooler.LoggerWrapper;
import com.kostyazyu.cooler.model.user.User;
import com.kostyazyu.cooler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserRestController.class);

    @Autowired
    private UserService userService;

    public User get() {
        int id = LoggedUser.id();
        LOG.info("get", id);
        return userService.get(id);
    }

    public void delete() {
        int id = LoggedUser.id();
        LOG.info("delete {}", id);
        userService.delete(id);
    }

    public void update(User user) {
        int id = LoggedUser.id();
        LOG.info("update");
        userService.update(user);
    }
}