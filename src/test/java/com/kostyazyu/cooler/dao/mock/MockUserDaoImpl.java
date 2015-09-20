package com.kostyazyu.cooler.dao.mock;

import com.kostyazyu.cooler.LoggerWrapper;
import com.kostyazyu.cooler.dao.UserDao;
import com.kostyazyu.cooler.model.user.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collections;
import java.util.List;

@Repository
public class MockUserDaoImpl implements UserDao {
    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserDaoImpl.class);

    @PostConstruct
    public void postConstruct() {
        LOG.info("+++ PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOG.info("+++ PreDestroy");
    }


    @Override
    public User save(User user) {
        LOG.info("save " + user);
        return user;
    }

    @Override
    public boolean delete(int id) {
        LOG.info("delete " + id);
        return id != 0;
    }

    @Override
    public User get(int id) {
        LOG.info("get " + id);
        return null;
    }

    @Override
    public User getByEmail(String email) {
        LOG.info("getByEmail " + email);
        return null;
    }

    @Override
    public List<User> getAll() {
        LOG.info("getAll");
        return Collections.emptyList();
    }
}
