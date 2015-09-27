package com.kostyazyu.cooler.service;

import com.kostyazyu.cooler.model.BaseEntity;
import com.kostyazyu.cooler.model.user.Role;
import com.kostyazyu.cooler.model.user.User;
import com.kostyazyu.cooler.util.DbPopulator;
import com.kostyazyu.cooler.util.NotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static com.kostyazyu.cooler.UserTestData.*;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Autowired
    protected UserService service;

    @Autowired
    private DbPopulator dbPopulator;

    @Before
    public void setUp() throws Exception {
        dbPopulator.execute();
    }

    @Test
    public void testSave() throws Exception {
        TestUser tu = new TestUser("New","Newman", "new@gmail.com", "newPass", Role.ROLE_USER);
        User created = service.save(tu.asUser());
        tu.setId(created.getId());
        MATCHER.assertListEquals(Arrays.asList(ADMIN, tu, USER), service.getAll());
    }

    @Test(expected = DataAccessException.class)
    public void testDuplicateMailSave() throws Exception {
        service.save(new TestUser("Duplicate", "Duplicatov", "user@gmail.com", "newPass", Role.ROLE_USER).asUser());
    }

    @Test
    public void testDelete() throws Exception {
        service.delete(BaseEntity.START_SEQ);
        MATCHER.assertListEquals(Collections.singletonList(ADMIN), service.getAll());
    }

    @Test(expected = NotFoundException.class)
    public void testNotFoundDelete() throws Exception {
        service.delete(1);
    }

    @Test
    public void testGet() throws Exception {
        User user = service.get(BaseEntity.START_SEQ);
        MATCHER.assertEquals(USER, user);
    }

    @Test
    public void testGetByEmail() throws Exception {
        User user = service.getByEmail("user@gmail.com");
        MATCHER.assertEquals(USER, user);
    }

    @Test
    public void testGetAll() throws Exception {
        List<User> all = service.getAll();
        MATCHER.assertListEquals(Arrays.asList(ADMIN, USER), all);
    }

    @Test
    public void testUpdate() throws Exception {
        TestUser updated = new TestUser(USER);
        updated.setFirstName("UpdatedFirstName");
        updated.setRegistrationDate(new Date());
        service.update(updated.asUser());
        MATCHER.assertEquals(updated, service.get(BaseEntity.START_SEQ));
    }
}