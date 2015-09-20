DELETE FROM user_roles;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

-- password
INSERT INTO users (firstname, lastname, email, password)
VALUES ('User', 'Userov', 'user@gmail.com', 'user_pass');
-- admin
INSERT INTO users (firstname, lastname, email, password)
VALUES ('Admin', 'Adminov', 'admin@gmail.com', 'admin_pass');

INSERT INTO user_roles (role, user_id) VALUES ('ROLE_USER', 100000);
INSERT INTO user_roles (role, user_id) VALUES ('ROLE_ADMIN', 100001);
