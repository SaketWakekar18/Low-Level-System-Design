package models;

import constants.VanType;
import constants.VehicleType;
import interfaces.Vehicle;

public class Van extends Vehicle {
    private VanType vanType;

    public Van(VanType vanType) {
        super(VehicleType.VAN);
        this.vanType = vanType;
    }

    public VanType getVanType() {
        return vanType;
    }

    public void setVanType(VanType vanType) {
        this.vanType = vanType;
    }
}
