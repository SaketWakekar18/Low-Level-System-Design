package models;

import interfaces.Vehicle;

public class ParkingStall {
    private int parkingStallId;
    private Vehicle vehicle;

    public int getParkingStallId() {
        return parkingStallId;
    }

    public void setParkingStallId(int parkingStallId) {
        this.parkingStallId = parkingStallId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
