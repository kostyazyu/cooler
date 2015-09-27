package com.kostyazyu.cooler.model;

import com.kostyazyu.cooler.model.other.*;
import com.kostyazyu.cooler.model.product.ProductRecord;
import com.kostyazyu.cooler.model.room.ColdRoomData;
import com.kostyazyu.cooler.model.user.User;

import java.time.LocalDate;
import java.util.List;

public class GeneralCalculation extends BaseEntity{
    private String name;
    private User user;
    private LocalDate date;
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
    private List<ProductRecord> productRecords; //includes breathing
    private LightData lightData;
    private int personnelNumber;
    private EquipmentData equipmentData;
    private FanData fanData;

    private double generalResult_kW;

    private GeneralCalculation(Builder builder) {
        super(builder.id);
        this.name = builder.name;
        this.user = builder.user;
        this.date = builder.date;
        this.userComment = builder.userComment;
        this.city = builder.city;
        this.processingTime_h = builder.processingTime_h;
        this.temperatureIndoors_C = builder.temperatureIndoors_C;
        this.temperatureOutside_C = builder.temperatureOutside_C;
        this.safetyFactor_df = builder.safetyFactor_df;
        this.length_m = builder.length_m;
        this.width_m = builder.width_m;
        this.height_m = builder.height_m;
        this.coldRoomData = builder.coldRoomData;
        this.coldRoomData = builder.coldRoomData;
        this.airCirculationRatio = builder.airCirculationRatio;
        this.infiltrationData = builder.infiltrationData;
        this.productRecords = builder.productRecords;
        this.lightData = builder.lightData;
        this.personnelNumber = builder.personnelNumber;
        this.equipmentData = builder.equipmentData;
        this.fanData = builder.fanData;
        this.generalResult_kW = builder.generalResult_kW;
    }

    public static class Builder {
        private Integer id;
        private String name;
        private User user;
        private LocalDate date;
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
        private List<ProductRecord> productRecords; //includes breathing
        private LightData lightData;
        private int personnelNumber;
        private EquipmentData equipmentData;
        private FanData fanData;

        private double generalResult_kW;

        public Builder(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder userComment(String userComment) {
            this.userComment = userComment;
            return this;
        }

        public Builder city(City city) {
            this.city = city;
            return this;
        }

        public Builder processingTime_h(int processingTime_h) {
            this.processingTime_h = processingTime_h;
            return this;
        }
        public Builder temperatureIndoors_C(int temperatureIndoors_C) {
            this.temperatureIndoors_C = temperatureIndoors_C;
            return this;
        }
        public Builder temperatureOutside_C(int temperatureOutside_C) {
            this.temperatureOutside_C = temperatureOutside_C;
            return this;
        }

        public Builder safetyFactor_df(double safetyFactor_df) {
            this.safetyFactor_df = safetyFactor_df;
            return this;
        }

        public Builder length_m(double length_m) {
            this.length_m = length_m;
            return this;
        }

        public Builder width_m(double width_m) {
            this.width_m = width_m;
            return this;
        }

        public Builder height_m(double height_m) {
            this.height_m = height_m;
            return this;
        }

        public Builder coldRoomData(ColdRoomData coldRoomData) {
            this.coldRoomData = coldRoomData;
            return this;
        }

        public Builder airCirculationRatio(double airCirculationRatio) {
            this.airCirculationRatio = airCirculationRatio;
            return this;
        }

        public Builder infiltrationData(InfiltrationData infiltrationData) {
            this.infiltrationData = infiltrationData;
            return this;
        }

        public Builder productRecords(List<ProductRecord> productRecords) {
            this.productRecords = productRecords;
            return this;
        }

        public Builder lightData(LightData lightData) {
            this.lightData = lightData;
            return this;
        }

        public Builder personnelNumber(int personnelNumber) {
            this.personnelNumber = personnelNumber;
            return this;
        }

        public Builder equipmentData(EquipmentData equipmentData) {
            this.equipmentData = equipmentData;
            return this;
        }

        public Builder fanData(FanData fanData) {
            this.fanData = fanData;
            return this;
        }

        public Builder generalResult_kW(double generalResult_kW) {
            this.generalResult_kW =generalResult_kW;
            return this;
        }

        public GeneralCalculation build() {
            return new GeneralCalculation(this);
        }
    }

    @Override
    public String toString() {
        return "GeneralCalculation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                ", date=" + date +
                ", userComment='" + userComment + '\'' +
                ", city=" + city +
                ", processingTime_h=" + processingTime_h +
                ", temperatureIndoors_C=" + temperatureIndoors_C +
                ", temperatureOutside_C=" + temperatureOutside_C +
                ", safetyFactor_df=" + safetyFactor_df +
                ", length_m=" + length_m +
                ", width_m=" + width_m +
                ", height_m=" + height_m +
                ", coldRoomData=" + coldRoomData +
                ", airCirculationRatio=" + airCirculationRatio +
                ", infiltrationData=" + infiltrationData +
                ", productRecords=" + productRecords +
                ", lightData=" + lightData +
                ", personnelNumber=" + personnelNumber +
                ", equipmentData=" + equipmentData +
                ", fanData=" + fanData +
                ", generalResult_kW=" + generalResult_kW +
                '}';
    }
}
