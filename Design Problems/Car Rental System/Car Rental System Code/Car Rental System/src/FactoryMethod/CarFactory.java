package FactoryMethod;

import constants.CarType;
import interfaces.Vehicle;
import models.Car;

public class CarFactory implements VehicleFactory {

    public CarType carType;

    public CarFactory(CarType carType) {
        this.carType = carType;
    }

    @Override
    public Vehicle createVehicle() {
        return new Car(carType);
    }
}
