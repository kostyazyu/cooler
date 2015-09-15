package com.kostyazyu.cooler.service;


import com.kostyazyu.cooler.model.GeneralCalculation;
import com.kostyazyu.cooler.model.other.City;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface GeneralCalcService {

    GeneralCalculation save(GeneralCalculation calculation, int userId);

    boolean delete(int id, int userId);

    void deleteAll(int userId);

    GeneralCalculation get(int id, int userId);

    List<GeneralCalculation> getAll(int userId);

    GeneralCalculation getByName(String name, int userId);

    GeneralCalculation getByCity(City city, int userId);

    List<GeneralCalculation> getBetween(LocalDateTime start, LocalDateTime end, int userId);

    default List<GeneralCalculation> getBetweenDates(LocalDate startDate, LocalDate endDate, int userId) {
        return getBetween(LocalDateTime.of(startDate, LocalTime.MIN), LocalDateTime.of(endDate, LocalTime.MAX), userId);
    }

}
