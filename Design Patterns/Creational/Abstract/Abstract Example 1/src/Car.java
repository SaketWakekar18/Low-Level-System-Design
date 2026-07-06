import Model.IEngine;

public class Car {

    IEngine iEngine;

    IVehicleFactory iVehicleFactory;

    public Car(IVehicleFactory iVehicleFactory) {
        this.iVehicleFactory = iVehicleFactory;
    }

    public void drive() {
        System.out.println("Driving...");
        iEngine = iVehicleFactory.createEngine();
    }
}

