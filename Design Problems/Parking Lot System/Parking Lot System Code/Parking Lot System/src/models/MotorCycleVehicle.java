package models;

import interfaces.Vehicle;

public class MotorCycleVehicle extends Vehicle {
    @Override
    public void assignTicket() {
        System.out.println("Assigning ticket to motor cycle vehicle");
    }

    @Override
    public void removeTicket() {
        System.out.println("Removing ticket to motor cycle vehicle");
    }
}
