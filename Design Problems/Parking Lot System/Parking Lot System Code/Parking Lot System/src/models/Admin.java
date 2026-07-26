package models;

import interfaces.Account;

public class Admin extends Account {

    public boolean addEntrace() {
        return true;
    }

    public boolean addExit() {
        return true;
    }

    public boolean addDisplayBoard() {
        return true;
    }

    public boolean addParkingSpots() {
        return true;
    }

    @Override
    public void resetPassword() {
        System.out.println("Reseting Password for Admin");
    }
}
