package com.kostyazyu.cooler.model;

public abstract class BaseEntity {

    protected int id;

    public BaseEntity() {
    }

    protected BaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return id == 0;
    }
}

