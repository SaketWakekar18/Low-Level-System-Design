package models;

import constants.VehicleType;
import interfaces.Account;
import interfaces.Vehicle;

import java.util.List;

public class Customer extends Account {
    private int customerId;
    private String licenceNumber;

    public void createReservation() {

    }

    public void cancelReservation() {

    }

    public List<Vehicle> searchByVehicleType(VehicleType vehicleType) {
        return null;
    }

    public List<Vehicle> searchByVehicleModel(String vehicleModel) {
        return null;
    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
