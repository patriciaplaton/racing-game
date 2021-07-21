package org.fasttrackit;

public class AutoVehicle extends Vehicle  {

    Engine engine;
    double mileage;

    public AutoVehicle (Engine engine) {
        super();
        this.engine = engine;
        System.out.println ("Custom constructor called");
    }
}
