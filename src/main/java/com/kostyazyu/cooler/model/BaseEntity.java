package com.kostyazyu.cooler.model;

import com.kostyazyu.cooler.LoggerWrapper;

public abstract class BaseEntity {

    protected static final LoggerWrapper LOG = LoggerWrapper.get(BaseEntity.class);

    public static final int START_SEQ = 100_000;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        if (id == 0 || that.id == 0) {
            throw LOG.getIllegalStateException("Equals '" + this + "' and '" + that + "' with 0 id");
        }
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

