package FactoryMethod;

import constants.VanType;
import interfaces.Vehicle;
import models.Van;

public class VanFactory implements VehicleFactory {
    private final VanType vanType;

    public VanFactory(VanType vanType) {
        this.vanType = vanType;
    }

    @Override
    public Vehicle createVehicle() {
        return new Van(vanType);
    }
}
