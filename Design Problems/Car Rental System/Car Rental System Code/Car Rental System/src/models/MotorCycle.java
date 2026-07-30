package models;

import constants.MotorCycleType;
import constants.VehicleType;
import interfaces.Vehicle;

public class MotorCycle extends Vehicle {
    public MotorCycleType motorCycleType;

    public MotorCycle(MotorCycleType motorCycleType) {
        super(VehicleType.MOTORCYCLE);
        this.motorCycleType = motorCycleType;
    }

    public MotorCycleType getMotorCycleType() {
        return motorCycleType;
    }

    public void setMotorCycleType(MotorCycleType motorCycleType) {
        this.motorCycleType = motorCycleType;
    }
}
