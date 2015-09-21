package com.kostyazyu.cooler.model.other;

import com.kostyazyu.cooler.model.BaseEntity;

public class City extends BaseEntity{
    private String name;
    private int baseTemperature_C;
    private double baseRelativeHumidity_df;

    public City() {
    }

    public City(int id, String name, int baseTemperature_C, double baseRelativeHumidity_df) {
        super(id);
        this.name = name;
        this.baseTemperature_C = baseTemperature_C;
        this.baseRelativeHumidity_df = baseRelativeHumidity_df;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseTemperature_C() {
        return baseTemperature_C;
    }

    public void setBaseTemperature_C(int baseTemperature_C) {
        this.baseTemperature_C = baseTemperature_C;
    }

    public double getBaseRelativeHumidity_df() {
        return baseRelativeHumidity_df;
    }

    public void setBaseRelativeHumidity_df(double baseRelativeHumidity_df) {
        this.baseRelativeHumidity_df = baseRelativeHumidity_df;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
