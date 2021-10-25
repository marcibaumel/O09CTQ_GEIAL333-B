package com.nonWebApp.nonwebapp;

import java.util.Arrays;

public class Car {
    private final Wheel[] wheels;
    private final Motor motor;
    private final String tipus;

    /*
    TODO:
    HF: letsztelni az autót
     */

    public Car(Wheel[] wheels, Motor motor, String tipus) throws NotRightData{
            if (wheels.length != 4 || motor == null || tipus == null) {
                throw new NotRightData();
            }
            this.wheels = wheels;
            this.motor = motor;
            this.tipus = tipus;

    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels[0].toString() +
                ", motor=" + motor +
                ", tipus='" + tipus + '\'' +
                '}';
    }
}
