package models;

public class DisplayBoard {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void showAvailableSpots(int availableCompactVehicles, int availableHandicappedVehicles, int availableLargeVehicles, int availableMotorCycleVehicles) {
        System.out.println("Compact Spots      : " + availableCompactVehicles);

        System.out.println("Handicapped Spots  : " + availableHandicappedVehicles);

        System.out.println("Large Spots        : " + availableLargeVehicles);

        System.out.println("Motorcycle Spots   : " + availableMotorCycleVehicles);

    }

    public void showParkingFullNotification() {
        System.out.println("Parking Full Notification");
    }
}
