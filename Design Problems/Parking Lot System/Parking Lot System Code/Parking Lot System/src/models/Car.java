package models;

import interfaces.Vehicle;

public class Car extends Vehicle {
    @Override
    public void assignTicket() {
        System.out.println("Assigning ticket to car");
    }

    @Override
    public void removeTicket() {
        System.out.println("Removing ticket from car");
    }
}
