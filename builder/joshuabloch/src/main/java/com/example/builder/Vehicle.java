package com.example.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Vehicle {

    // Attributes
    protected String manufacturer;
    protected String model;

    // Getter methods
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this); 
    }
}
