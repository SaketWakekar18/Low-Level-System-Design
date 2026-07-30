package FactoryMethod;

import constants.MotorCycleType;
import interfaces.Vehicle;
import models.MotorCycle;

public class MotorCycleFactory implements VehicleFactory {
    public MotorCycleType motorCycleType;

    public MotorCycleFactory(MotorCycleType motorCycleType) {
        this.motorCycleType = motorCycleType;
    }

    @Override
    public Vehicle createVehicle() {
        return new MotorCycle(motorCycleType);
    }
}
