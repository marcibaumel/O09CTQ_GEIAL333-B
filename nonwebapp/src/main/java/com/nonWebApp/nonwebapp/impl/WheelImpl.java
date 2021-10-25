package com.nonWebApp.nonwebapp.impl;

import com.nonWebApp.nonwebapp.Wheel;

public class WheelImpl implements Wheel {
    private final int szelesseg;
    private final int atmero;
    private final int kopenyMagassag;

    public WheelImpl(int szelesseg, int atmero, int kopenyMagassag) {
        this.szelesseg = szelesseg;
        this.atmero = atmero;
        this.kopenyMagassag = kopenyMagassag;
    }

    @Override
    public String toString() {
        return "WheelImpl{"+szelesseg+"/"+kopenyMagassag+"R"+atmero + '}';
    }
}
