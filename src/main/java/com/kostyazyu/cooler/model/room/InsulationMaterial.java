package com.kostyazyu.cooler.model.room;

import com.kostyazyu.cooler.model.BaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "INSULATIONS", uniqueConstraints = @UniqueConstraint(columnNames = "name", name = "unique_insulation_name"))
@NamedQueries({
        @NamedQuery(name = InsulationMaterial.DELETE, query = "DELETE FROM InsulationMaterial i WHERE i.id=:id"),
        @NamedQuery(name = InsulationMaterial.BY_NAME, query = "SELECT i FROM InsulationMaterial i WHERE i.name=:name"),
        @NamedQuery(name = InsulationMaterial.ALL_SORTED, query = "SELECT i FROM InsulationMaterial i ORDER BY i.name"),
})
public class InsulationMaterial extends BaseEntity{

    public static final String DELETE = "InsulationMaterial.delete";
    public static final String BY_NAME = "InsulationMaterialgetByName";
    public static final String ALL_SORTED = "InsulationMaterial.getAllSorted";

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "heatConductionCoefficient_W_mK", nullable = false)
    private double heatConductionCoefficient_W_mK = 1d;

    public InsulationMaterial() {
    }

    public InsulationMaterial(Integer id, String name, double heatConductionCoefficient_W_mK) {
        super(id);
        this.name = name;
        this.heatConductionCoefficient_W_mK = heatConductionCoefficient_W_mK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeatConductionCoefficient_W_mK() {
        return heatConductionCoefficient_W_mK;
    }

    public void setHeatConductionCoefficient_W_mK(double heatConductionCoefficient_W_mK) {
        this.heatConductionCoefficient_W_mK = heatConductionCoefficient_W_mK;
    }

    @Override
    public String toString() {
        return "InsulationMaterial{" +
                "name='" + name + '\'' +
                ", heatConductionCoefficient_W_mK=" + heatConductionCoefficient_W_mK +
                '}';
    }
}

