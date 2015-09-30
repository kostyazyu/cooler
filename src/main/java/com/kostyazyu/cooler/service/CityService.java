package com.kostyazyu.cooler.service;

import com.kostyazyu.cooler.model.other.City;
import com.kostyazyu.cooler.util.NotFoundException;

import java.util.List;

public interface CityService {

    City save(City city);

    void delete(int id) throws NotFoundException;

    City get(int id) throws NotFoundException;

    City getByName(String name) throws NotFoundException;

    List<City> getAll();

    void update(City city) throws NotFoundException;

}
