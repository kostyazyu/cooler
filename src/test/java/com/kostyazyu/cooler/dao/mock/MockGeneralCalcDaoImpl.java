package com.kostyazyu.cooler.dao.mock;

import com.kostyazyu.cooler.LoggerWrapper;
import com.kostyazyu.cooler.dao.GeneralCalcDao;
import com.kostyazyu.cooler.model.GeneralCalculation;
import com.kostyazyu.cooler.model.other.City;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Repository
public class MockGeneralCalcDaoImpl implements GeneralCalcDao {
    private static final LoggerWrapper LOG = LoggerWrapper.get(MockGeneralCalcDaoImpl.class);
    private static final List<GeneralCalculation> calculationList = Arrays.asList(
            new GeneralCalculation.Builder(1, "moscow-stock")
                    .date(LocalDate.of(2015, Month.AUGUST, 9))
                    .city(new City(10, "Moscow", 31, 65))
                    .build(),
            new GeneralCalculation.Builder(2, "kaluga-discounter")
                    .date(LocalDate.of(2015, Month.JULY, 28))
                    .city(new City(20, "Kaluga", 32, 70))
                    .build(),
            new GeneralCalculation.Builder(3, "vologda-ryba")
                    .date(LocalDate.of(2014, Month.MAY, 21))
                    .city(new City(30,"Vologda", 28, 75))
                    .build(),
            new GeneralCalculation.Builder(4, "oskol-broiler")
                    .date(LocalDate.of(2014, Month.JUNE, 3))
                    .city(new City(40,"Oskol", 32, 60))
                    .build()
            );

    @Override
    public GeneralCalculation save(GeneralCalculation calculation, int userId) {
        LOG.info("Save {} for User {}", calculation, userId);
        return calculation;
    }

    @Override
    public boolean delete(int id, int userId) {
        LOG.info("Delete {} for User {}", id, userId);
        return false;
    }

    @Override
    public void deleteAll(int userId) {
        LOG.info("Delete all for User " + userId);
    }

    @Override
    public GeneralCalculation get(int id, int userId) {
        LOG.info("Get {} for User {}", id, userId);
        return null;
    }

    @Override
    public List<GeneralCalculation> getAll(int userId) {
        LOG.info("Get all for User " + userId);
        return calculationList;
    }

    @Override
    public GeneralCalculation getByName(String name, int userId) {
        LOG.info("Get by name {} for User {}", name, userId);
        return null;
    }

    @Override
    public GeneralCalculation getByCity(City city, int userId) {
        LOG.info("Get by City {} for User {}", city, userId);
        return null;
    }

    @Override
    public List<GeneralCalculation> getBetween(LocalDate start, LocalDate end, int userId) {
        LOG.info("Get between {} and {} for User {}", start, end, userId);
        return calculationList;
    }
}
