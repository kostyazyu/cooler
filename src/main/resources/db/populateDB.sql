DELETE FROM user_roles;
DELETE FROM users;
DELETE FROM cities;
DELETE FROM packings;
DELETE FROM products;
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

INSERT INTO products (name, freezingPoint_C, solidSpecificHeat_kJ_kgK, liquidSpecificHeat_kJ_kgK, latentHeatOfMelting_kJ_kg, respiratoryHeat_kJ_tonKg_10, respiratoryHeat_kJ_tonKg_20, respiratoryHeat_kJ_tonKg_30)
VALUES ('Beef', -2, 1500, 2000, 300, 0, 0, 0);
INSERT INTO products (name, freezingPoint_C, solidSpecificHeat_kJ_kgK, liquidSpecificHeat_kJ_kgK, latentHeatOfMelting_kJ_kg, respiratoryHeat_kJ_tonKg_10, respiratoryHeat_kJ_tonKg_20, respiratoryHeat_kJ_tonKg_30)
VALUES ('Pepper', -1, 2300, 2000, 200, 10, 8, 6);
INSERT INTO products (name, freezingPoint_C, solidSpecificHeat_kJ_kgK, liquidSpecificHeat_kJ_kgK, latentHeatOfMelting_kJ_kg, respiratoryHeat_kJ_tonKg_10, respiratoryHeat_kJ_tonKg_20, respiratoryHeat_kJ_tonKg_30)
VALUES ('Salmon', -4, 2500, 2100, 230, 0, 0, 0);