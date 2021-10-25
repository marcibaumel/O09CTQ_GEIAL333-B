package com.nonWebApp.nonwebapp;

import java.util.Arrays;

public class Car {
    private final Wheel[] wheels;
    private final Motor motor;
    private final String tipus;

    /*
    TODO:
    Hf: wht if null, what if wheels not 4
    HF: letsztelni az autót
     */

    public Car(Wheel[] wheels, Motor motor, String tipus) {
        if(wheels.length != 4){
            //throw NotGoodWheel;
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
