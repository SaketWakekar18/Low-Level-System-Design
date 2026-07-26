package models;

import interfaces.Vehicle;

public class Van extends Vehicle {
    @Override
    public void assignTicket() {
        System.out.println("Assigning ticket to Van");
    }

    @Override
    public void removeTicket() {
        System.out.println("Removing ticket from Van");
    }
}
