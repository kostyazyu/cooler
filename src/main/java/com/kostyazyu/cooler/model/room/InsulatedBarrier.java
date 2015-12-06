package com.kostyazyu.cooler.model.room;

import com.kostyazyu.cooler.model.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Konstantin Zyubin
 * on 15.11.2015.
 * Moscow, Reutov
 */

@Embeddable
public class InsulatedBarrier{

    public InsulatedBarrier() {
    }

    @NotNull
    @OneToOne
    @JoinColumn(name = "first_material_id")
    private InsulationMaterial insulationMaterialFirstLayer;

    @NotNull
    @Column(name = "thicknessFirstLayerMM")
    private double thicknessFirstLayerMM;

    @NotNull
    @OneToOne
    @JoinColumn(name = "second_material_id")
    private InsulationMaterial insulationMaterialSecondLayer;

    @NotNull
    @Column(name = "thicknessSecondLayerMM")
    private double thicknessSecondLayerMM;

    @NotNull
    @Column(name = "outsideTemperatureC")
    private double outsideTemperatureC;

}
