package com.kostyazyu.cooler;

import com.kostyazyu.cooler.matcher.ModelMatcher;
import com.kostyazyu.cooler.model.BaseEntity;
import com.kostyazyu.cooler.model.user.Role;
import com.kostyazyu.cooler.model.user.User;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;


public class UserTestData {

    public static final TestUser USER = new TestUser(BaseEntity.START_SEQ, "User", "Userov", "user@gmail.com", "user_pass", true, Role.ROLE_USER);
    public static final TestUser ADMIN = new TestUser(BaseEntity.START_SEQ + 1, "Admin", "Adminov", "admin@gmail.com", "admin_pass", true, Role.ROLE_ADMIN);

    public static class TestUser extends User {

        public TestUser(User u) {
            this(u.getId(), u.getFirstName(), u.getLastName(), u.getEmail(), u.getPassword(), u.isEnabled(), u.getRoles());
        }

        public TestUser(String firstName, String lastName, String email, String password, Role role, Role... roles) {
            this(null, firstName, lastName, email, password, true, EnumSet.of(role, roles));
        }

        public TestUser(Integer id, String firstName, String lastName, String email, String password, boolean enabled, Role role, Role... roles) {
            this(id, firstName, lastName, email, password, enabled, EnumSet.of(role, roles));
        }

        public TestUser(Integer id, String firstName, String lastName, String email, String password, boolean enabled, Set<Role> roles) {
            super(id, firstName, lastName, email, password, enabled, roles);
        }

        public User asUser() {
            return new User(this);
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", enabled=" + enabled +
                    ", registrationDate=" + registrationDate +
                    ", roles=" + roles +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TestUser that = (TestUser) o;

            return Objects.equals(this.password, that.password)
                    && Objects.equals(this.id, that.id)
                    && Objects.equals(this.firstName, that.firstName)
                    && Objects.equals(this.lastName, that.lastName)
                    && Objects.equals(this.email, that.email)
                    && Objects.equals(this.enabled, that.enabled);
        }
    }

    public static final ModelMatcher<User, TestUser> MATCHER = new ModelMatcher<>(
            u -> ((u instanceof TestUser) ? (TestUser) u : new TestUser(u)));

}
