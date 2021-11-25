package com.company;

public class Electrocar extends Car {
    private String color;

    public Electrocar() {

    }
    public Electrocar(String name, int maxspeed, double power, String color) {
        super(name, maxspeed, power);
        this.color = color;
    }

    @Override
    public void go() {
        super.go();
    }
}
