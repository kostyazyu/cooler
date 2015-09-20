package com.kostyazyu.cooler.web.user;

import com.kostyazyu.cooler.model.user.Role;
import com.kostyazyu.cooler.model.user.User;
import com.kostyazyu.cooler.util.NotFoundException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

import static org.junit.Assert.*;

@ContextConfiguration("classpath:spring/spring-app.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AdminUserRestControllerTest {

    @Autowired
    private AdminUserRestController controller;

    @Test
    public void testCreate() throws Exception {
        controller.create(new User(null, "Luke", "Besson", "lbes@mail.com", "pass", Role.ROLE_USER));
    }

    @Test
    public void testDelete() throws Exception {
        controller.delete(7);
    }

    @Test(expected = NotFoundException.class)
    public void testDeleteNotFound() throws Exception {
        controller.delete(0);
    }
}