package org.fasttrackit;

public class Vehicle {

    String name;
    String color;
    int wheelCount;

    public Vehicle () {
        this.wheelCount = 4;
    }

    public Vehicle (String name, String color, int wheelCount) {
        this.name = name;
        this.color = color;
        this.wheelCount = wheelCount;
    }

    public double accelerate(double speed) {
        System.out.println(speed);
        return 10.5;
    }
}
