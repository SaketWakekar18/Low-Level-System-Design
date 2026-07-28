package models;

import java.util.List;

public class Building {
    private List<Floor> floors;
    private List<Elevator> elevators;
    private ElevatorSystem elevatorSystem;

    private Building() {

    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public ElevatorSystem getElevatorSystem() {
        return elevatorSystem;
    }

    public void setElevatorSystem(ElevatorSystem elevatorSystem) {
        this.elevatorSystem = elevatorSystem;
    }

    private static class Solution {
        public static final Building INSTANCE = new Building();
    }

    public static Building getInstance() {
        return Solution.INSTANCE;
    }
}
