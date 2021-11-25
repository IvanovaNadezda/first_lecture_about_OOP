package com.company;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setName("BMW");
        System.out.println(bmw.getName());
        Car opel = new Car();
        bmw.setMaxspeed(250);
        System.out.println(bmw.getMaxspeed());
        Car skoda = new Car("skoda",300,100);
        System.out.println(skoda.getPower());
        Gazcar nisan = new Gazcar();
        nisan.go();

        Electrocar tesla = new Electrocar();
        tesla.setName("Better car or car for Ilom Mask?");
        tesla.go();
        System.out.println(tesla.getName());

    }
}
