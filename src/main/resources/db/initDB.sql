DROP TABLE IF EXISTS USER_ROLES;
DROP TABLE IF EXISTS USERS;
DROP TABLE IF EXISTS CITIES;
DROP SEQUENCE IF EXISTS GLOBAL_SEQ;

CREATE SEQUENCE GLOBAL_SEQ START 100000;

CREATE TABLE USERS
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('GLOBAL_SEQ'),
  firstname        VARCHAR(50),
  lastname         VARCHAR(50),
  email            VARCHAR NOT NULL,
  password         VARCHAR NOT NULL,
  registrationDate DATE DEFAULT now(),
  enabled          BOOL DEFAULT TRUE
);

CREATE UNIQUE INDEX unique_email ON USERS (email);

CREATE TABLE USER_ROLES
(
  user_id INTEGER NOT NULL,
  role    VARCHAR,
  CONSTRAINT user_roles_idx UNIQUE (user_id, role),
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE CITIES(
  id                       INTEGER PRIMARY KEY DEFAULT nextval('GLOBAL_SEQ'),
  name                     VARCHAR(50) UNIQUE NOT NULL,
  temperature_C            REAL NOT NULL,
  relativeHumidity_p       INTEGER NOT NULL
);

CREATE UNIQUE INDEX unique_city_name ON CITIES (name)