package com.example.builder;

import java.util.Objects;

public class Car extends Vehicle {

    // Attributes
    private Integer luggageCapacity;

    // Getter methods
    public Integer getLuggageCapacity() {
        return luggageCapacity;
    }
    
    // Private constructor
    private Car(Builder builder) {
        this.manufacturer = builder.manufacturer;
        this.model = builder.model;
        this.luggageCapacity = builder.luggageCapacity;
    }

    // Builder class - using Joshua Bloch’s builder pattern
    public static class Builder {

        private final String manufacturer;
        private String model;
        private Integer luggageCapacity;

        public Builder(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder luggageCapacity(Integer luggageCapacity) {
            this.luggageCapacity = luggageCapacity;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(model, car.model) &&
                Objects.equals(luggageCapacity, car.luggageCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, luggageCapacity);
    }
}
