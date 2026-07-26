package models;

public class DisplayBoard {
    private int id;
    private int availableCompactSizedVehicles;
    private int availableHandicappedSizedVehicles;
    private int availableLargeSizedVehicles;
    private int availableMotorCycleSizedVehicles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailableCompactSizedVehicles() {
        return availableCompactSizedVehicles;
    }

    public void setAvailableCompactSizedVehicles(int availableCompactSizedVehicles) {
        this.availableCompactSizedVehicles = availableCompactSizedVehicles;
    }

    public int getAvailableHandicappedSizedVehicles() {
        return availableHandicappedSizedVehicles;
    }

    public void setAvailableHandicappedSizedVehicles(int availableHandicappedSizedVehicles) {
        this.availableHandicappedSizedVehicles = availableHandicappedSizedVehicles;
    }

    public int getAvailableLargeSizedVehicles() {
        return availableLargeSizedVehicles;
    }

    public void setAvailableLargeSizedVehicles(int availableLargeSizedVehicles) {
        this.availableLargeSizedVehicles = availableLargeSizedVehicles;
    }

    public int getAvailableMotorCycleSizedVehicles() {
        return availableMotorCycleSizedVehicles;
    }

    public void setAvailableMotorCycleSizedVehicles(int availableMotorCycleSizedVehicles) {
        this.availableMotorCycleSizedVehicles = availableMotorCycleSizedVehicles;
    }

    public void showAvailableSpots(int availableCompactSizedVehicles, int availableHandicappedSizedVehicles, int availableLargeSizedVehicles, int availableMotorCycleSizedVehicles) {
        System.out.println("Compact Spots      : " + availableCompactSizedVehicles);

        System.out.println("Handicapped Spots  : " + availableHandicappedSizedVehicles);

        System.out.println("Large Spots        : " + availableLargeSizedVehicles);

        System.out.println("Motorcycle Spots   : " + availableMotorCycleSizedVehicles);

    }

    public void showParkingFullNotification() {
        System.out.println("Parking Full Notification");
    }
}
