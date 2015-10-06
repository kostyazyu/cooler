DELETE FROM user_roles;
DELETE FROM users;
DELETE FROM cities;
DELETE FROM packings;
ALTER SEQUENCE global_seq RESTART WITH 100000;

-- password
INSERT INTO users (firstname, lastname, email, password) VALUES ('User', 'Userov', 'user@gmail.com', 'user_pass');
-- admin
INSERT INTO users (firstname, lastname, email, password) VALUES ('Admin', 'Adminov', 'admin@gmail.com', 'admin_pass');

INSERT INTO user_roles (role, user_id) VALUES ('ROLE_USER', 100000);
INSERT INTO user_roles (role, user_id) VALUES ('ROLE_ADMIN', 100001);

--populate cities

INSERT INTO cities (name, temperature_C, relativeHumidity_p) VALUES ('Moscow', 30, 70);
INSERT INTO cities (name, temperature_C, relativeHumidity_p) VALUES ('Hong Kong', 35, 75);
INSERT INTO cities (name, temperature_C, relativeHumidity_p) VALUES ('Berlin', 32, 60);
INSERT INTO cities (name, temperature_C, relativeHumidity_p) VALUES ('Oslo', 27, 80);


INSERT INTO packings (name, solidSpecificHeat_kJ_kgK) VALUES ('PPU', 1000);
INSERT INTO packings (name, solidSpecificHeat_kJ_kgK) VALUES ('Perlit', 3000);
INSERT INTO packings (name, solidSpecificHeat_kJ_kgK) VALUES ('MinWool', 2000);
