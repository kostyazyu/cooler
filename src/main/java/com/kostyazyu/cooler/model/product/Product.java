package com.kostyazyu.cooler.model.product;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS", uniqueConstraints = @UniqueConstraint(columnNames = "name", name = "unique_product_name"))
@NamedQueries({
        @NamedQuery(name = Product.DELETE, query = "DELETE FROM Product p WHERE p.id=:id"),
        @NamedQuery(name = Product.BY_NAME, query = "SELECT p FROM Product p WHERE p.name=:name"),
        @NamedQuery(name = Product.ALL_SORTED, query = "SELECT p FROM Product p ORDER BY p.name"),
})
public class Product extends BaseProduct {

    public static final String DELETE = "Product.delete";
    public static final String BY_NAME = "Product.getByName";
    public static final String ALL_SORTED = "Product.getAllSorted";

    @NotNull
    @Column(name="freezingPoint_C", nullable = false)
    private double freezingPoint_C;

    @NotNull
    @Column(name="liquidSpecificHeat_kJ_kgK", nullable = false)
    private double liquidSpecificHeat_kJ_kgK;

    @NotNull
    @Column(name="latentHeatOfMelting_kJ_kg", nullable = false)
    private double latentHeatOfMelting_kJ_kg;

    @NotNull
    @Column(name="respiratoryHeat_kJ_tonKg_10", nullable = false)
    private double respiratoryHeat_kJ_tonKg_10;

    @NotNull
    @Column(name="respiratoryHeat_kJ_tonKg_20", nullable = false)
    private double respiratoryHeat_kJ_tonKg_20;

    @NotNull
    @Column(name="respiratoryHeat_kJ_tonKg_30", nullable = false)
    private double respiratoryHeat_kJ_tonKg_30;

    public Product() {
    }

    public Product(Integer id,
                   String name,
                   double solidSpecificHeat_kJ_kgK,
                   double freezingPoint_C,
                   double liquidSpecificHeat_kJ_kgK,
                   double latentHeatOfMelting_kJ_kg,
                   double respiratoryHeat_kJ_tonKg_10,
                   double respiratoryHeat_kJ_tonKg_20,
                   double respiratoryHeat_kJ_tonKg_30) {
        super(id, name, solidSpecificHeat_kJ_kgK);
        this.freezingPoint_C = freezingPoint_C;
        this.liquidSpecificHeat_kJ_kgK = liquidSpecificHeat_kJ_kgK;
        this.latentHeatOfMelting_kJ_kg = latentHeatOfMelting_kJ_kg;
        this.respiratoryHeat_kJ_tonKg_10 = respiratoryHeat_kJ_tonKg_10;
        this.respiratoryHeat_kJ_tonKg_20 = respiratoryHeat_kJ_tonKg_20;
        this.respiratoryHeat_kJ_tonKg_30 = respiratoryHeat_kJ_tonKg_30;
    }

    public double getFreezingPoint_C() {
        return freezingPoint_C;
    }

    public void setFreezingPoint_C(double freezingPoint_C) {
        this.freezingPoint_C = freezingPoint_C;
    }

    public double getLiquidSpecificHeat_kJ_kgK() {
        return liquidSpecificHeat_kJ_kgK;
    }

    public void setLiquidSpecificHeat_kJ_kgK(double liquidSpecificHeat_kJ_kgK) {
        this.liquidSpecificHeat_kJ_kgK = liquidSpecificHeat_kJ_kgK;
    }

    public double getLatentHeatOfMelting_kJ_kg() {
        return latentHeatOfMelting_kJ_kg;
    }

    public void setLatentHeatOfMelting_kJ_kg(double latentHeatOfMelting_kJ_kg) {
        this.latentHeatOfMelting_kJ_kg = latentHeatOfMelting_kJ_kg;
    }

    public double getRespiratoryHeat_kJ_tonKg_10() {
        return respiratoryHeat_kJ_tonKg_10;
    }

    public void setRespiratoryHeat_kJ_tonKg_10(double respiratoryHeat_kJ_tonKg_10) {
        this.respiratoryHeat_kJ_tonKg_10 = respiratoryHeat_kJ_tonKg_10;
    }

    public double getRespiratoryHeat_kJ_tonKg_20() {
        return respiratoryHeat_kJ_tonKg_20;
    }

    public void setRespiratoryHeat_kJ_tonKg_20(double respiratoryHeat_kJ_tonKg_20) {
        this.respiratoryHeat_kJ_tonKg_20 = respiratoryHeat_kJ_tonKg_20;
    }

    public double getRespiratoryHeat_kJ_tonKg_30() {
        return respiratoryHeat_kJ_tonKg_30;
    }

    public void setRespiratoryHeat_kJ_tonKg_30(double respiratoryHeat_kJ_tonKg_30) {
        this.respiratoryHeat_kJ_tonKg_30 = respiratoryHeat_kJ_tonKg_30;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", solidSpecificHeat_kJ_kgK=" + solidSpecificHeat_kJ_kgK +
                ", freezingPoint_C=" + freezingPoint_C +
                ", liquidSpecificHeat_kJ_kgK=" + liquidSpecificHeat_kJ_kgK +
                ", latentHeatOfMelting_kJ_kg=" + latentHeatOfMelting_kJ_kg +
                ", respiratoryHeat_kJ_tonKg_10=" + respiratoryHeat_kJ_tonKg_10 +
                ", respiratoryHeat_kJ_tonKg_20=" + respiratoryHeat_kJ_tonKg_20 +
                ", respiratoryHeat_kJ_tonKg_30=" + respiratoryHeat_kJ_tonKg_30 +
                '}';
    }
}
