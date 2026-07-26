package models;

import interfaces.ParkingSpot;

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
    private DisplayBoard displayBoard;
    private Map<String, List<ParkingSpot>> parkingSpots;
    private ParkingRate parkingRates;
    private Map<String, ParkingTicket> parkingTickets;
    private int currentVehicleCount;
    private int availableCompactSizedVehicles;
    private int availableHandicappedSizedVehicles;
    private int availableLargeSizedVehicles;
    private int availableMotorCycleSizedVehicles;

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

    public void showAvailableSpots(DisplayBoard displayBoard) {
        displayBoard.showAvailableSpots(availableCompactSizedVehicles, availableHandicappedSizedVehicles, availableLargeSizedVehicles, availableMotorCycleSizedVehicles);
    }

    public void updateDisplayBoard() {
        displayBoard.showAvailableSpots(availableCompactSizedVehicles, availableHandicappedSizedVehicles, availableLargeSizedVehicles, availableMotorCycleSizedVehicles);

        if (isFull()) {
            throw new RuntimeException("Parking Lot Full");
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

    private boolean addParkingTicket(ParkingTicket parkingTicket) {
        return true;
    }


}
