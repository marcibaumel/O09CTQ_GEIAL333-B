package com.nonWebApp.nonwebapp.impl;

import com.nonWebApp.nonwebapp.Motor;

public class BelsoEgesuMotor implements Motor {
    private final int loero;
    private final int ccn;

    public BelsoEgesuMotor(int loero, int ccn) {
        this.loero = loero;
        this.ccn = ccn;
    }

    @Override
    public String toString() {
        return "MotorImpl{" +
                "loero=" + loero +
                ", ccn=" + ccn +
                '}';
    }
}
