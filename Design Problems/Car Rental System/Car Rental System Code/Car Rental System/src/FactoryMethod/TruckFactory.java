package FactoryMethod;

import constants.TruckType;
import interfaces.Vehicle;
import models.Truck;

public class TruckFactory implements VehicleFactory {

    private TruckType truckType;

    public TruckFactory(TruckType truckType) {
        this.truckType = truckType;
    }

    @Override
    public Vehicle createVehicle() {
        return new Truck(truckType);
    }
}
