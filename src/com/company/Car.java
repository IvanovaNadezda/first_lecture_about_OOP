package com.company;

public class Car {
    protected String name;
    protected int maxspeed;
    protected double power;

    public void go(){
        System.out.println("let's go!!!");
    }

    public  Car() {

    }
    public Car(String name, int maxspeed, double power) {
        this.name = name;
        this.maxspeed = maxspeed;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
