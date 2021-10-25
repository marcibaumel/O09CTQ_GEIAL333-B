package com.nonWebApp.nonwebapp;

import java.util.Arrays;

public class Car {
    private final Wheel[] wheels;
    private final Motor motor;
    private final String tipus;

    public Car(Wheel[] wheels, Motor motor, String tipus) {
        this.wheels = wheels;
        this.motor = motor;
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                ", motor=" + motor +
                ", tipus='" + tipus + '\'' +
                '}';
    }
}
