package com.kostyazyu.cooler.model.other;

import com.kostyazyu.cooler.model.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "CITIES", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "unique_name")})
@NamedQueries({
        @NamedQuery(name = City.DELETE, query = "DELETE FROM City c WHERE c.id=:id"),
        @NamedQuery(name = City.BY_NAME, query = "SELECT c FROM City c WHERE c.name=:name"),
        @NamedQuery(name = City.ALL_SORTED, query = "SELECT c FROM City c ORDER BY c.name"),
})
public class City extends BaseEntity{

    public static final String DELETE = "City.delte";
    public static final String BY_NAME = "City.getByName";
    public static final String ALL_SORTED = "City.getAllSorted";

    private String name;
    private int temperature_C;

    private double relativeHumidity_p; /*percent*/

    public City() {
    }

    public City(Integer id, String name, int temperature_C, double relativeHumidity_p) {
        super(id);
        this.name = name;
        this.temperature_C = temperature_C;
        this.relativeHumidity_p = relativeHumidity_p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRelativeHumidity_p() {
        return relativeHumidity_p;
    }

    public void setRelativeHumidity_p(double relativeHumidity_p) {
        this.relativeHumidity_p = relativeHumidity_p;
    }

    public int getTemperature_C() {
        return temperature_C;
    }

    public void setTemperature_C(int temperature_C) {
        this.temperature_C = temperature_C;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", temperature_C=" + temperature_C +
                ", relativeHumidity_p=" + relativeHumidity_p +
                '}';
    }
}
