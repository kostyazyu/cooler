package com.kostyazyu.cooler.model.user;

import com.kostyazyu.cooler.model.BaseEntity;

import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

public class User extends BaseEntity {

    protected String firstName;

    protected String lastName;

    protected String email;

    protected String password;

    protected boolean enabled = true;

    protected Date registrationDate; // why Date not LocalDateTime

    protected Set<Role> roles;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String email, String password, Role role, Role... roles) {
        this(id, firstName, lastName, email, password, true, EnumSet.of(role, roles));
    }

    public User(User u) {
        this(u.getId(), u.getFirstName(), u.getLastName(), u.getEmail(), u.getPassword(), u.isEnabled(), u.getRoles());
    }

    public User(int id, String firstName, String lastName, String email, String password, boolean enabled, Set<Role> roles) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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
}
