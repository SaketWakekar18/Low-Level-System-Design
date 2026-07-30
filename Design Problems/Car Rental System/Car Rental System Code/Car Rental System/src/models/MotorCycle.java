package models;

import constants.MotorCycleType;
import interfaces.Vehicle;

public class MotorCycle extends Vehicle {
    private MotorCycleType motorCycleType;

    public MotorCycleType getMotorCycleType() {
        return motorCycleType;
    }

    public void setMotorCycleType(MotorCycleType motorCycleType) {
        this.motorCycleType = motorCycleType;
    }
}
