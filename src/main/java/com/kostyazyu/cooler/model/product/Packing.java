package com.kostyazyu.cooler.model.product;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name = "PACKINGS", uniqueConstraints = @UniqueConstraint(columnNames = "name", name = "unique_packing_name"))
@NamedQueries({
        @NamedQuery(name = Packing.DELETE, query = "DELETE FROM Packing p WHERE p.id=:id"),
        @NamedQuery(name = Packing.BY_NAME, query = "SELECT p FROM Packing p WHERE p.name=:name"),
        @NamedQuery(name = Packing.ALL_SORTED, query = "SELECT p FROM Packing p ORDER BY p.name"),
})
public class Packing extends BaseProduct {
    public static final String DELETE = "Packing.delete";
    public static final String BY_NAME = "Packing.getByName";
    public static final String ALL_SORTED = "Packing.getAllSorted";

    public Packing() {
    }

    public Packing(Integer id, String name, double solidSpecificHeat_kJ_kgK) {
        super(id, name, solidSpecificHeat_kJ_kgK);
    }

    @Override
    public String toString() {
        return "Packing{" +
                    "name='" + name + '\'' +
                    ", solidSpecificHeat_kJ_kgK=" + solidSpecificHeat_kJ_kgK +
                '}';
    }
}