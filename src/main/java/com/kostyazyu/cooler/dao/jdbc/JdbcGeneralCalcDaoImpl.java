package com.kostyazyu.cooler.dao.jdbc;

import com.kostyazyu.cooler.dao.GeneralCalcDao;
import com.kostyazyu.cooler.model.GeneralCalculation;
import com.kostyazyu.cooler.model.other.City;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class JdbcGeneralCalcDaoImpl implements GeneralCalcDao {

    @Override
    public GeneralCalculation save(GeneralCalculation calculation, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public void deleteAll(int userId) {

    }

    @Override
    public GeneralCalculation get(int id, int userId) {
        return null;
    }

    @Override
    public List<GeneralCalculation> getAll(int userId) {
        return null;
    }

    @Override
    public GeneralCalculation getByName(String name, int userId) {
        return null;
    }

    @Override
    public GeneralCalculation getByCity(City city, int userId) {
        return null;
    }

    @Override
    public List<GeneralCalculation> getBetween(LocalDate start, LocalDate end, int userId) {
        return null;
    }
}
