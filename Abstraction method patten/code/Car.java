package code;

import Models.IEngine;

public class Car {
    
    IEngine engine;

    IVehicleFactory carFactory;

    Car(IVehicleFactory factory)
    {
        this.carFactory = factory;
    }

    public void driveCar()
    {
        engine = carFactory.createEngine();
        System.out.println("Engine will be created.");
    }
}
