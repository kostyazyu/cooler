package com.kostyazyu.cooler.model.room;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Embeddable
public class ColdRoom {

    @Column(name = "temperatureIndoorsC")
    @NotNull
    private Double temperatureIndoorsC;

    @Column(name = "lengthM")
    @NotNull
    private Double lengthM;

    @Column(name = "widthM")
    @NotNull
    private Double widthM;

    @Column(name = "heightM")
    @NotNull
    private Double heightM;

    @ElementCollection
    @CollectionTable(name = "calculation_barriers", joinColumns = @JoinColumn(name = "calculation_id"))
    private List<InsulatedBarrier> barriers;

    /*
    *                0(width)
    *               ___________
    *              |           |
    *              |           |
    *  3(length)   |           |  1(length)
    *              |           |
    *              |___________|
    *
    *                2(width)
    *
    *           ceiling = 4
    *           floor = 5
    * */
}
