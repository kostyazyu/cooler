package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.dao.GeneralCalcDao;
import com.kostyazyu.cooler.model.GeneralCalculation;
import com.kostyazyu.cooler.model.other.City;
import com.kostyazyu.cooler.service.GeneralCalcService;
import com.kostyazyu.cooler.util.exception.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class GeneralCalcServiceImpl implements GeneralCalcService {

    @Autowired
    private GeneralCalcDao calcDao;

    @Override
    public GeneralCalculation save(GeneralCalculation calculation, int userId) {
        return calcDao.save(calculation, userId);
    }

    @Override
    public GeneralCalculation update(GeneralCalculation calculation, int userId) {
        return ExceptionUtil.check(calcDao.save(calculation, userId), calculation.getId());
    }

    @Override
    public void delete(int id, int userId) {
        ExceptionUtil.check(calcDao.delete(id, userId), id);
    }

    @Override
    public void deleteAll(int userId) {
        calcDao.deleteAll(userId);
    }

    @Override
    public GeneralCalculation get(int id, int userId) {
        return ExceptionUtil.check(calcDao.get(id, userId), id);
    }

    @Override
    public List<GeneralCalculation> getAll(int userId) {
        return calcDao.getAll(userId);
    }

    @Override
    public GeneralCalculation getByName(String name, int userId) {
        return ExceptionUtil.check(calcDao.getByName(name, userId), "name " + name);
    }

    @Override
    public GeneralCalculation getByCity(City city, int userId) {
        return ExceptionUtil.check(calcDao.getByCity(city, userId), "city " + city);
    }

    @Override
    public List<GeneralCalculation> getBetween(LocalDate start, LocalDate end, int userId) {
        return calcDao.getBetween(start, end, userId);
    }
}
