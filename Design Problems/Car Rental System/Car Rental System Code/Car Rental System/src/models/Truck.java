package models;

import constants.TruckType;
import interfaces.Vehicle;

public class Truck extends Vehicle {

    private TruckType truckType;

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }
}
