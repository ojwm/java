package com.example.builder;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Demo {

    @Test
    public void buildCar() {

        final Car car = new Car.Builder("Ford")
                .model("Focus")
                .luggageCapacity(300)
                .build();

        System.out.println(car);
        assertTrue(true);
    }

    @Test
    public void buildVan() {

        final Van van = new Van.Builder("Mercedes")
                .model("Sprinter")
                .cargoCapacity(5000)
                .build();

        System.out.println(van);
        assertTrue(true);
    }
}
