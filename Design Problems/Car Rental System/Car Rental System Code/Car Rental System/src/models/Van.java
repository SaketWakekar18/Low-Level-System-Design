package models;

import constants.VanType;
import interfaces.Vehicle;

public class Van extends Vehicle {
    private VanType vanType;

    public VanType getVanType() {
        return vanType;
    }

    public void setVanType(VanType vanType) {
        this.vanType = vanType;
    }
}
