package org.fasttrackit;

public class RadioControlledCar extends AutoVehicle {

    // primivites types

    int doorCount;
    public RadioControlledCar() {
        super(null);
    }

    public RadioControlledCar(Engine engine) {
        super(engine);
    }

    public RadioControlledCar (int doorCount) {
        super(null);
        this.doorCount = doorCount;
    }

    public RadioControlledCar(Engine engine, int doorCount, String name, String color, int wheelCount) {
        super(engine);
        this.doorCount = doorCount;
        this.engine = engine;
        this.name = name;
        this.color = color;
        this.wheelCount = wheelCount;
    }

    // data type                 100 ---- 150
    /// --->>>  [][][][][][][][]


    // numere intregi
    // int -> 65500   (e.g 4)     ----> 2 bytes [][]
    // long -> 256000             ----> 4 bytes [][][][]

    // 0  1 2 3 4 ..                       16 mil.
    // [][][][][][] .. [adresa 100][][][][[[][][][][][]]]  16 gb

    // numere cu virgula
    // float --> 65500  (e.g 4,5)
    // double --> 256000 (e.g 212,222)
}
