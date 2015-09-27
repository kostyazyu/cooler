package com.kostyazyu.cooler.dao.jdbc;

import com.kostyazyu.cooler.dao.UserDao;
import com.kostyazyu.cooler.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class JdbcUserRepositoryImpl implements UserDao {

    private static final BeanPropertyRowMapper<User> ROW_MAPPER = BeanPropertyRowMapper.newInstance(User.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private SimpleJdbcInsert insertUser;

    @Autowired
    public JdbcUserRepositoryImpl(DataSource dataSource) {
        this.insertUser = new SimpleJdbcInsert(dataSource)
                .withTableName("USERS")
                .usingGeneratedKeyColumns("id");
    }

    @Override
    public User save(User user) {
        MapSqlParameterSource map = new MapSqlParameterSource()
                .addValue("id", user.getId())
                .addValue("firstname", user.getFirstName())
                .addValue("lastname", user.getLastName())
                .addValue("email", user.getEmail())
                .addValue("password", user.getPassword())
                .addValue("registrationdate", user.getRegistrationDate())
                .addValue("enabled", user.isEnabled());

        if (user.isNew()) {
            Number newKey = insertUser.executeAndReturnKey(map);
            user.setId(newKey.intValue());
        } else {
            namedParameterJdbcTemplate.update(
                    "UPDATE users SET firstname=:firstname, lastname=:lastname ,email=:email, password=:password, " +
                            "registrationdate=:registrationdate, enabled=:enabled WHERE id=:id", map);
        }
        return user;
    }

    @Override
    public boolean delete(int id) {
        return jdbcTemplate.update("DELETE FROM users WHERE id=?", id) != 0;
    }

    @Override
    public User get(int id) {
        return jdbcTemplate.queryForObject(
                "SELECT id, firstName, lastName,  email,  password, registrationDate, enabled FROM users WHERE id=?",
                ROW_MAPPER, id);
    }

    @Override
    public User getByEmail(String email) {
        return jdbcTemplate.queryForObject(
                "SELECT id, firstName, lastname,  email, password, registrationdate, enabled FROM users WHERE email=?",
                ROW_MAPPER, email);
    }

    @Override
    public List<User> getAll() {
        return jdbcTemplate.query(
                "SELECT id, firstName, lastname, email, password, registrationdate, enabled FROM users ORDER BY lastname, firstname, email",
                ROW_MAPPER);
    }
}
