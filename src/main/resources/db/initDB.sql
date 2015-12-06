DROP TABLE IF EXISTS USER_ROLES;
DROP TABLE IF EXISTS USERS;
DROP TABLE IF EXISTS CITIES;
DROP TABLE IF EXISTS PACKINGS;
DROP TABLE IF EXISTS PRODUCTS;
DROP TABLE IF EXISTS INSULATIONS;
DROP TABLE IF EXISTS CALCULATIONS;
DROP TABLE IF EXISTS PRODUCT_RECORDS;
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
  temperature_C            DOUBLE PRECISION NOT NULL,
  relativeHumidity_p       DOUBLE PRECISION NOT NULL
);

CREATE UNIQUE INDEX unique_city_name ON CITIES (name);

CREATE TABLE PACKINGS (
  id                       INTEGER PRIMARY KEY DEFAULT nextval('GLOBAL_SEQ'),
  name                     VARCHAR(50) UNIQUE NOT NULL,
  solidSpecificHeat_kJ_kgK REAL NOT NULL
);

CREATE UNIQUE INDEX unique_packing_name ON PACKINGS (name);


CREATE TABLE PRODUCTS (
  id                          INTEGER PRIMARY KEY DEFAULT nextval('GLOBAL_SEQ'),
  name                        VARCHAR(50) UNIQUE NOT NULL,
  freezingPoint_C             INTEGER NOT NULL,
  solidSpecificHeat_kJ_kgK    DOUBLE PRECISION NOT NULL,
  liquidSpecificHeat_kJ_kgK   DOUBLE PRECISION NOT NULL,
  latentHeatOfMelting_kJ_kg   DOUBLE PRECISION NOT NULL,
  respiratoryHeat_kJ_tonKg_10 DOUBLE PRECISION NOT NULL,
  respiratoryHeat_kJ_tonKg_20 DOUBLE PRECISION NOT NULL,
  respiratoryHeat_kJ_tonKg_30 DOUBLE PRECISION NOT NULL
);

CREATE UNIQUE INDEX unique_product_name ON PRODUCTS (name);

CREATE TABLE INSULATIONS (
  id                              INTEGER PRIMARY KEY DEFAULT nextval('GLOBAL_SEQ'),
  name                            VARCHAR(50) UNIQUE NOT NULL,
  heatConductionCoefficient_W_mK  DOUBLE PRECISION NOT NULL
);

CREATE UNIQUE INDEX unique_insulation_name ON INSULATIONS (name);

CREATE TABLE CALCULATIONS (
  id                          INTEGER PRIMARY KEY DEFAULT nextval('GLOBAL_SEQ'),
  user_id                     INTEGER NOT NULL,
  name                        VARCHAR(50) UNIQUE NOT NULL,
  date                        DATE DEFAULT now(),
  userComment                 TEXT,
  city_id                     INTEGER,
  processingTimeH             DOUBLE PRECISION NOT NULL,
  temperatureOutsideC         DOUBLE PRECISION NOT NULL,
  safetyFactorDF              DOUBLE PRECISION NOT NULL,
  temperatureIndoorsC         DOUBLE PRECISION NOT NULL,
  lengthM                     DOUBLE PRECISION NOT NULL,
  widthM                      DOUBLE PRECISION NOT NULL,
  heightM                     DOUBLE PRECISION NOT NULL,
  airCirculationRatio         DOUBLE PRECISION NOT NULL,
  doorHeightM                 DOUBLE PRECISION NOT NULL,
  doorWidthM                  DOUBLE PRECISION NOT NULL,
  openCoefficientDF           DOUBLE PRECISION NOT NULL,
  curtainCoefficientDF        DOUBLE PRECISION NOT NULL,
  automaticDoor               BOOL DEFAULT FALSE


);

CREATE TABLE PRODUCT_RECORDS (
  id                          INTEGER PRIMARY KEY DEFAULT nextval('GLOBAL_SEQ')

);

