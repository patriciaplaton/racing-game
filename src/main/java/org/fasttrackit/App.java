package org.fasttrackit;

public class App 
{
    public static void main( String[] args ) {

        Race race = new Race();

        RadioControlledCar dacia = new RadioControlledCar() ;
        dacia.name = "Dacia";
        dacia.color = "red";
        dacia.doorCount = 4;
        dacia.wheelCount = 4;
        dacia.mileage = 8.5;

        Engine daciaEngine = new Engine();
        daciaEngine.manufacturer = "Renault";

        dacia.engine = daciaEngine;

        RadioControlledCar lada = new RadioControlledCar(daciaEngine, 2, "lada", "blue", 4);
        lada.mileage = 8;

        Engine ladaEngine = new Engine();
        ladaEngine.manufacturer = "Lada";
        lada.engine = ladaEngine;

        race.firstCar = dacia;
        race.secondCar = lada;


        dacia.accelerate(18.1);
    }
}
