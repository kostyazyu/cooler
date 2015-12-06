package com.kostyazyu.cooler.model.other;

import com.kostyazyu.cooler.model.BaseEntity;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "CITIES", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "unique_name")})
@NamedQueries({
        @NamedQuery(name = City.DELETE, query = "DELETE FROM City c WHERE c.id=:id"),
        @NamedQuery(name = City.BY_NAME, query = "SELECT c FROM City c WHERE c.name=:name"),
        @NamedQuery(name = City.ALL_SORTED, query = "SELECT c FROM City c ORDER BY c.name"),
})
@Getter
@Setter
@ToString(callSuper = true, includeFieldNames = true)
public class City extends BaseEntity {

    public static final String DELETE = "City.delte";
    public static final String BY_NAME = "City.getByName";
    public static final String ALL_SORTED = "City.getAllSorted";

    @NotEmpty
    private String name;

    @NotNull
    private Double temperature_C;

    @NotNull
    private Double relativeHumidity_p; /*percent*/

    public City() {}

    public City(Integer id, String name, Double temperature_C, Double relativeHumidity_p) {
        super(id);
        this.name = name;
        this.temperature_C = temperature_C;
        this.relativeHumidity_p = relativeHumidity_p;
    }
}
