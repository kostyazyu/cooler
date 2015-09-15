package com.kostyazyu.cooler.model;

import com.kostyazyu.cooler.model.other.*;
import com.kostyazyu.cooler.model.product.ProductRecord;
import com.kostyazyu.cooler.model.room.ColdRoomData;
import com.kostyazyu.cooler.model.user.User;

import java.time.LocalDateTime;
import java.util.List;

public class GeneralCalculation {
    private int id;
    private String name; //external ID
    private User user;
    private LocalDateTime dateTime;
    private String userComment;

    private City city;
    private int processingTime_h;
    private int temperatureIndoors_C;
    private int temperatureOutside_C;
    private double safetyFactor_df; //decimal fractions
    private double length_m, width_m, height_m;

    private ColdRoomData coldRoomData;
    private double airCirculationRatio; // for ventilation calc
    private InfiltrationData infiltrationData;
    private List<ProductRecord> products; //includes breathing
    private LightData lightData;
    private int personnelNumber;
    private EquipmentData equipmentData;
    private FanData fanData;

    private double generalResult_kW;

    public GeneralCalculation() {
    }

    //TODO think about builder pattern to use here



}
