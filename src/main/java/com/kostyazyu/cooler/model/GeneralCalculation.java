package com.kostyazyu.cooler.model;

import com.kostyazyu.cooler.model.other.*;
import com.kostyazyu.cooler.model.product.ProductRecord;
import com.kostyazyu.cooler.model.room.ColdRoom;
import com.kostyazyu.cooler.model.user.User;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "calculations")
public class GeneralCalculation extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    @NotNull
    private LocalDate date;

    @Column(name = "userComment")
    @NotEmpty
    private String userComment;

    //TODO
    @OneToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;

    @Column(name = "processingTimeH")
    @NotNull
    private Double processingTimeH;

    @Column(name = "temperatureOutsideC")
    @NotNull
    private Double temperatureOutsideC;

    @Column(name = "safetyFactorDF")
    @NotNull
    private Double safetyFactorDF; //decimal fractions

    @NotNull
    @Embedded
    private ColdRoom coldRoom; //TODO barriers table

    @Column(name = "airCirculationRatio")
    @NotNull
    private Double airCirculationRatio; // for ventilation calc

    @NotNull
    @Embedded
    private InfiltrationData infiltrationData;

//    TODO
    @OneToMany(targetEntity = ProductRecord.class)
    @JoinColumn(name = "calculation_id")
    private List<ProductRecord> productRecords; //includes breathing

    @NotNull
    @Embedded
    private LightData lightData;


    @Column(name = "personnelQnty")
    @NotNull
    private Integer personnelQnty;

    @NotNull
    @Embedded
    private EquipmentData equipmentData;

    @NotNull
    @Embedded
    private FanData fanData;

    @Column(name = "generalResultKW")
    @NotNull
    private Double generalResultKW;

    private GeneralCalculation(Builder builder) {
        super(builder.id);
        this.name = builder.name;
        this.user = builder.user;
        this.date = builder.date;
        this.userComment = builder.userComment;
        this.city = builder.city;
        this.processingTimeH = builder.processingTimeH;
        this.temperatureOutsideC = builder.temperatureOutsideC;
        this.safetyFactorDF = builder.safetyFactorDF;
        this.coldRoom = builder.coldRoom;
        this.airCirculationRatio = builder.airCirculationRatio;
        this.infiltrationData = builder.infiltrationData;
        this.productRecords = builder.productRecords;
        this.lightData = builder.lightData;
        this.personnelQnty = builder.personnelQnty;
        this.equipmentData = builder.equipmentData;
        this.fanData = builder.fanData;
        this.generalResultKW = builder.generalResultKW;
    }

    public GeneralCalculation() {}

    public static class Builder {
        private Integer id;
        private String name;
        private User user;
        private LocalDate date;
        private String userComment;

        private City city;
        private Double processingTimeH;
        private Double temperatureOutsideC;
        private Double safetyFactorDF; //decimal fractions

        private ColdRoom coldRoom;
        private Double airCirculationRatio; // for ventilation calc
        private InfiltrationData infiltrationData;
        private List<ProductRecord> productRecords; //includes breathing
        private LightData lightData;
        private Integer personnelQnty;
        private EquipmentData equipmentData;
        private FanData fanData;

        private Double generalResultKW;

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

        public Builder processingTimeH(Double processingTimeH) {
            this.processingTimeH = processingTimeH;
            return this;
        }

        public Builder temperatureOutside_C(Double temperatureOutsideC) {
            this.temperatureOutsideC = temperatureOutsideC;
            return this;
        }

        public Builder safetyFactor_df(Double safetyFactorDF) {
            this.safetyFactorDF = safetyFactorDF;
            return this;
        }

        public Builder coldRoomData(ColdRoom coldRoom) {
            this.coldRoom = coldRoom;
            return this;
        }

        public Builder airCirculationRatio(Double airCirculationRatio) {
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

        public Builder personnelNumber(Integer personnelQnty) {
            this.personnelQnty = personnelQnty;
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

        public Builder generalResultKW(Double generalResultKW) {
            this.generalResultKW = generalResultKW;
            return this;
        }

        public GeneralCalculation build() {
            return new GeneralCalculation(this);
        }
    }
}
