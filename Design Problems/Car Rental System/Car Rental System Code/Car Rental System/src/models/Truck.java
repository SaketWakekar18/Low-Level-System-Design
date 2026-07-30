package models;

import constants.TruckType;
import constants.VehicleType;
import interfaces.Vehicle;

public class Truck extends Vehicle {

    private TruckType truckType;

    public Truck(TruckType truckType) {
        super(VehicleType.TRUCK);
        this.truckType = truckType;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }
}
