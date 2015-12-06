package com.kostyazyu.cooler.model.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "PRODUCTS", uniqueConstraints = @UniqueConstraint(columnNames = "name", name = "unique_product_name"))
@NamedQueries({
        @NamedQuery(name = Product.DELETE, query = "DELETE FROM Product p WHERE p.id=:id"),
        @NamedQuery(name = Product.BY_NAME, query = "SELECT p FROM Product p WHERE p.name=:name"),
        @NamedQuery(name = Product.ALL_SORTED, query = "SELECT p FROM Product p ORDER BY p.name"),
})
@Getter
@Setter
@ToString(callSuper = true)
public class Product extends BaseProduct {

    public static final String DELETE = "Product.delete";
    public static final String BY_NAME = "Product.getByName";
    public static final String ALL_SORTED = "Product.getAllSorted";

    @NotNull
    private double freezingPoint_C;

    @NotNull
    private double liquidSpecificHeat_kJ_kgK;

    @NotNull
    private double latentHeatOfMelting_kJ_kg;

    @NotNull
    private double respiratoryHeat_kJ_tonKg_10;

    @NotNull
    private double respiratoryHeat_kJ_tonKg_20;

    @NotNull
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

}
