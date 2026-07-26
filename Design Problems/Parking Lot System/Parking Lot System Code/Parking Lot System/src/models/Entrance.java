package models;

import interfaces.Vehicle;

public class Entrance {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingTicket getTicket(Vehicle vehicle) {
        return null;
    }
}
