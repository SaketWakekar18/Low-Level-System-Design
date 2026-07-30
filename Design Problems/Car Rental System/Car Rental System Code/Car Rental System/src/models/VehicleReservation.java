package models;

import constants.ReservationStatus;
import constants.VehicleStatus;
import interfaces.Vehicle;

import java.util.Date;

public class VehicleReservation {
    private Vehicle vehicle;
    private Date issueDate;
    private Date pickupDate;
    private Date returnDate;
    private Customer customer;
    private VehicleStatus vehicleStatus;
    private double amount;
    private ReservationStatus reservationStatus;


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public void isEquipmentAdded(Equipment equipment) {

    }

    public void isServiceAdded(Service service) {

    }

    public void issueVehicle(Vehicle vehicle) {

    }

    public void collectVehicle(Vehicle vehicle) {

    }

    public double calculateAmount() {
        return 0;
    }

    public double calculateFine() {
        return 0;
    }


}
