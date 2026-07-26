package models;

import interfaces.ParkingSpot;

public class Handicapped extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        return false;
    }
}
