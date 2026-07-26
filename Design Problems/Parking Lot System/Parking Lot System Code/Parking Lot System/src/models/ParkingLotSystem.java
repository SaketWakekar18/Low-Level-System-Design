package models;

import interfaces.ParkingSpot;
import interfaces.Vehicle;

import java.util.List;
import java.util.Map;

public class ParkingLotSystem {
    private volatile static ParkingLotSystem instance = null;
    private final int MAX_CAPACITY = 40000;
    private String name;
    private int id;
    private String address;
    private List<Entrance> entrances;
    private List<Exit> exits;
    private Map<String, List<ParkingSpot>> parkingSpots;
    private ParkingRate parkingRates;
    private Map<String, ParkingTicket> parkingTickets;
    private int currentVehicleCount;
    private int availableCompactVehicles;
    private int availableHandicappedVehicles;
    private int availableLargeVehicles;
    private int availableMotorCycleVehicles;

    private DisplayBoard displayBoard;

    private ParkingLotSystem() {

    }

    public static ParkingLotSystem getInstance() {
        if (instance == null) {
            synchronized (ParkingLotSystem.class) {
                if (instance == null) {
                    instance = new ParkingLotSystem();
                }
            }
        }
        return instance;
    }

    private boolean isFull() {
        return currentVehicleCount >= MAX_CAPACITY;
    }

    public void showAvailableSpots() {
        displayBoard.showAvailableSpots(availableCompactVehicles, availableHandicappedVehicles, availableLargeVehicles, availableMotorCycleVehicles);
    }

    public void updateDisplayBoard() {
        displayBoard.showAvailableSpots(availableCompactVehicles, availableHandicappedVehicles, availableLargeVehicles, availableMotorCycleVehicles);

        if (isFull()) {
            displayBoard.showParkingFullNotification();
        }
    }

    private boolean addEntrance(Entrance entrance) {
        return true;
    }

    private boolean addExit(Exit exit) {
        return true;
    }

    private boolean addParkingSpot(ParkingSpot parkingSpot) {
        return true;
    }

    private void findAvailableSpots(Vehicle vehicle) {}

    private void assignParkingTicket(ParkingTicket parkingTicket) {}

    private ParkingTicket parkVehicle(Vehicle vehicle) { return null;}

    private void removeVehicle(ParkingTicket ticket) {}
}
