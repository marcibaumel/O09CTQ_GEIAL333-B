package com.nonWebApp.nonwebapp;

import com.nonWebApp.nonwebapp.impl.BelsoEgesuMotor;
import com.nonWebApp.nonwebapp.impl.WheelImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Motor motor;
    private String type;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testCarWithGoodData(){
        motor = new BelsoEgesuMotor(100, 1600);
        type = "Opel Astra";
        Car autoAstra = new Car(getKerekek(), motor, type);
        assertEquals(type, autoAstra.getTipus());
    }

/*
    @Test(expected = NotRightData.class)
    void testCarWithBadData(){
        motor = new BelsoEgesuMotor(100, 1600);
        type = "Opel Astra";
        Car autoAstra = new Car(getKerekek(), motor, type);
        assertEquals(type, autoAstra.getTipus());
    }
 */

    private static Wheel[] getKerekek(){
        int sizeOfTheArray = 4;
        Wheel[] kerekek = new Wheel[sizeOfTheArray];
        for (int i = 0; i<sizeOfTheArray; i++){
            kerekek[i] = new WheelImpl(205, 15, 65);
        }
        return kerekek;
    }
}