package com.kostyazyu.cooler.service.calculator;

import com.kostyazyu.cooler.model.GeneralCalculation;

public interface Calculator {

    double calculateGeneral(GeneralCalculation calculation);

    double calculateColdRoom(GeneralCalculation calculation);

    double calculateVentilation(GeneralCalculation calculation);

    double calculateInfiltration(GeneralCalculation calculation);

    double calculateCooling(GeneralCalculation calculation);

    double calculateBreathing(GeneralCalculation calculation);

    double calculateLight(GeneralCalculation calculation);

    double calculatePersonnel(GeneralCalculation calculation);

    double calculateEquipment(GeneralCalculation calculation);

    double calculateFans(GeneralCalculation calculation);
}
