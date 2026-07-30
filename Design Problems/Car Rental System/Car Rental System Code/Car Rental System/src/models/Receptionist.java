package models;

import FactoryMethod.VehicleFactory;
import interfaces.Account;
import interfaces.Vehicle;

public class Receptionist extends Account {

    private int receptionistId;

    public void makeReservation() {

    }

    public void modifyRegistration() {

    }

    public void cancelRegistration() {

    }

    public void collectPayment(int reservationId) {

    }

    public void addVehicle(Branch branch, VehicleFactory vehicleFactory) {
        Vehicle vehicle = vehicleFactory.createVehicle();
        branch.addedVehicles();
        System.out.println("Vehicle added successfully: "+ vehicle.getVehicleType());
    }

    public void removeVehicle(Branch branch, VehicleFactory vehicleFactory) {

    }

    public void issueVehicle(Vehicle vehicle) {

    }

    public void collectVehicle(Vehicle vehicle) {

    }


    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
