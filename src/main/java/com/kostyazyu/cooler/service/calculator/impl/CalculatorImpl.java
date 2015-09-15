package com.kostyazyu.cooler.service.calculator.impl;

import com.kostyazyu.cooler.model.GeneralCalculation;
import com.kostyazyu.cooler.service.calculator.Calculator;

public class CalculatorImpl implements Calculator {

    @Override
    public double calculateGeneral(GeneralCalculation calculation) {
        return  calculateColdRoom(calculation) +
                calculateVentilation(calculation) +
                calculateInfiltration(calculation) +
                calculateCooling(calculation) +
                calculateBreathing(calculation) +
                calculateLight(calculation) +
                calculatePersonnel(calculation) +
                calculateEquipment(calculation) +
                calculateFans(calculation);
    }

    @Override
    public double calculateColdRoom(GeneralCalculation calculation) {
        return 0;
    }

    @Override
    public double calculateVentilation(GeneralCalculation calculation) {
        return 0;
    }

    @Override
    public double calculateInfiltration(GeneralCalculation calculation) {
        return 0;
    }

    @Override
    public double calculateCooling(GeneralCalculation calculation) {
        return 0;
    }

    @Override
    public double calculateBreathing(GeneralCalculation calculation) {
        return 0;
    }

    @Override
    public double calculateLight(GeneralCalculation calculation) {
        return 0;
    }

    @Override
    public double calculatePersonnel(GeneralCalculation calculation) {
        return 0;
    }

    @Override
    public double calculateEquipment(GeneralCalculation calculation) {
        return 0;
    }

    @Override
    public double calculateFans(GeneralCalculation calculation) {
        return 0;
    }

}
