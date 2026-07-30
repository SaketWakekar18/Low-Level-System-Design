package models;

import constants.CarType;
import constants.VehicleType;
import interfaces.Vehicle;

public class Car extends Vehicle {
    private CarType carType;

    public Car(CarType carType) {
        super(VehicleType.CAR);
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
