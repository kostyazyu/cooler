package com.kostyazyu.cooler.model.product;

import com.kostyazyu.cooler.model.BaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public abstract class BaseProduct extends BaseEntity {

    @NotEmpty
    @Column(name = "name", nullable = false)
    protected String name;


    @NotNull
    @Column(name="solidSpecificHeat_kJ_kgK", nullable = false)
    protected double solidSpecificHeat_kJ_kgK;

    public BaseProduct() {
    }

    public BaseProduct(Integer id, String name, double solidSpecificHeat_kJ_kgK) {
        super(id);
        this.name = name;
        this.solidSpecificHeat_kJ_kgK = solidSpecificHeat_kJ_kgK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSolidSpecificHeat_kJ_kgK() {
        return solidSpecificHeat_kJ_kgK;
    }

    public void setSolidSpecificHeat_kJ_kgK(double solidSpecificHeat_kJ_kgK) {
        this.solidSpecificHeat_kJ_kgK = solidSpecificHeat_kJ_kgK;
    }
}
