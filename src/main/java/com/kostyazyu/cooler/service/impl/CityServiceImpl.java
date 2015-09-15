package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.dao.CityDao;
import com.kostyazyu.cooler.model.other.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityDao {

    //TODO realization after implementation of JPA DAOs

    @Override
    public City save(City city) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public City get(int id) {
        return null;
    }

    @Override
    public City getByCoordinates(int coordinates) {
        return null;
    }

    @Override
    public City getByName(String name) {
        return null;
    }

    @Override
    public List<City> getAll() {
        return null;
    }
}
