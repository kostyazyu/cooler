package com.kostyazyu.cooler.dao;

import com.kostyazyu.cooler.model.GeneralCalculation;
import com.kostyazyu.cooler.model.other.City;

import java.time.LocalDateTime;
import java.util.List;

public interface GeneralCalcDao {

    GeneralCalculation save(GeneralCalculation calculation, int userId);

    //false if not found
    boolean delete(int id, int userId);

    void deleteAll(int userId);

    //null if not found
    GeneralCalculation get(int id, int userId);

    List<GeneralCalculation> getAll(int userId);

    //null if not found
    GeneralCalculation getByName(String name, int userId);

    //null if not found
    GeneralCalculation getByCity(City city, int userId);

    //null if not found
    GeneralCalculation getBetween(LocalDateTime start, LocalDateTime end, int userId);

}
