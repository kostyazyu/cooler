package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.dao.CityDao;
import com.kostyazyu.cooler.model.other.City;
import com.kostyazyu.cooler.service.CityService;
import com.kostyazyu.cooler.util.NotFoundException;
import com.kostyazyu.cooler.util.exception.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityDao cityDao;


    @Override
    public City save(City city) {
        return cityDao.save(city);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        ExceptionUtil.check(cityDao.delete(id), id);
    }

    @Override
    public City get(int id) throws NotFoundException {
        return ExceptionUtil.check(cityDao.get(id), id);
    }

    @Override
    public City getByName(String name) throws NotFoundException {
        return ExceptionUtil.check(cityDao.getByName(name), "name = " + name);
    }

    @Override
    public List<City> getAll() {
        return cityDao.getAll();
    }

    @Override
    public void update(City city) throws NotFoundException {
        ExceptionUtil.check(cityDao.save(city), city.getId());
    }
}
