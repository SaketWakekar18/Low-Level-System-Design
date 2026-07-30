package models;

import java.util.List;

public class CarRentalSystem {
    private List<Branch> branches;
    private List<VehicleReservation>  reservations;

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public List<VehicleReservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<VehicleReservation> reservations) {
        this.reservations = reservations;
    }

    public void addBranches(Branch branches) {
        this.branches.add(branches);
    }
    public void addReservations(VehicleReservation reservations) {
        this.reservations.add(reservations);
    }
}
