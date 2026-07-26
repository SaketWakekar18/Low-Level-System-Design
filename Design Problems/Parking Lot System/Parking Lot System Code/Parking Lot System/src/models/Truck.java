package models;

import interfaces.Vehicle;

public class Truck extends Vehicle {
    @Override
    public void assignTicket() {
        System.out.println("Assigning ticket to Truck");
    }

    @Override
    public void removeTicket() {
        System.out.println("Removing ticket from Truck");
    }
}
