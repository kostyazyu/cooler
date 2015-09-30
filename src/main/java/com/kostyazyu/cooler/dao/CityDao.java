package com.kostyazyu.cooler.dao;

import com.kostyazyu.cooler.model.other.City;

import java.util.List;

public interface CityDao {

    City save(City city);

    //false if not found
    boolean delete(int id);

    //null if not found
    City get(int id);

    //null if not found
    City getByName(String name);

    //empty list if not found
    List<City> getAll();

}
