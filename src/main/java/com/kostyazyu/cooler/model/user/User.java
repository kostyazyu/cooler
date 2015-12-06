package com.kostyazyu.cooler.model.user;

import com.kostyazyu.cooler.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

@Entity
@Table(name = "USERS", uniqueConstraints = {@UniqueConstraint(columnNames = "email", name = "unique_email")})
@NamedQueries({
        @NamedQuery(name = User.DELETE, query = "DELETE FROM User u WHERE u.id=:id"),
        @NamedQuery(name = User.GET_BY_EMAIL, query = "SELECT u FROM User u LEFT JOIN FETCH u.roles WHERE u.email=:email"),
        @NamedQuery(name = User.ALL_SORTED, query = "SELECT u FROM User u LEFT JOIN FETCH u.roles ORDER BY u.lastName, u.firstName, u.email"),
})
@Getter
@Setter
@ToString(callSuper = true)
public class User extends BaseEntity {

    public static final String DELETE = "User.delete";
    public static final String ALL_SORTED = "User.allSorted";
    public static final String GET_BY_EMAIL = "User.getByEmail";

    @NotEmpty
    protected String firstName;

    @NotEmpty
    protected String lastName;

    @NotEmpty
    @Email
    protected String email;

    @NotEmpty
    @Length(min = 5)
    protected String password;

    protected boolean enabled = true;

    @Column(name = "registrationDate", columnDefinition = "timestamp default now()")
    protected Date registrationDate;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    protected Set<Role> roles;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String email, String password, Role role, Role... roles) {
        this(id, firstName, lastName, email, password, true, EnumSet.of(role, roles));
    }

    public User(User u) {
        this(u.getId(), u.getFirstName(), u.getLastName(), u.getEmail(), u.getPassword(), u.isEnabled(), u.getRoles());
    }

    public User(Integer id, String firstName, String lastName, String email, String password, boolean enabled, Set<Role> roles) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }
}
