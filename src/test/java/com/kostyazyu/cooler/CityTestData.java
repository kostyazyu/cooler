package com.kostyazyu.cooler;

import com.kostyazyu.cooler.matcher.ModelMatcher;
import com.kostyazyu.cooler.model.other.City;

import java.util.Arrays;
import java.util.List;

import static com.kostyazyu.cooler.model.BaseEntity.START_SEQ;

public class CityTestData {
    public static final Integer CITY_SEQUENCE = START_SEQ + 2;

    public static final City MOSCOW = new City(CITY_SEQUENCE, "Moscow", 30d, 70d);
    public static final City HONG_KONG = new City(CITY_SEQUENCE + 1, "Hong Kong", 35d, 75d);
    public static final City BERLIN = new City(CITY_SEQUENCE + 2, "Berlin", 32d, 60d);
    public static final City OSLO = new City(CITY_SEQUENCE + 3, "Oslo", 27d, 80d);

    public static final List<City> CITIES = Arrays.asList(BERLIN, HONG_KONG, MOSCOW, OSLO);

    public static City getCreated() {
        return new City(null, "Antverpen Created ", 20d, 50d);
    }

    public static City getUpdated() {
        return new City(CITY_SEQUENCE, MOSCOW.getName() + "Renewed", 5d, 60d);
    }

    public static final ModelMatcher<City, String> MATCHER = new ModelMatcher<>(City::toString);
}
