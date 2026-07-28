package models;

import constants.DirectionStatus;
import constants.ElevatorStatus;

import java.util.Queue;

public class Elevator {
    private int elevatorId;
    private ElevatorPanel elevatorPanel;
    private ElevatorDisplay elevatorDisplay;
    private int currentFloor;
    private int currentCapacity;
    private final int maxCapacity = 8;
    private int currentWeight;
    private final int maxWeight = 680;
    private Doors door;
    private Queue<Request> requests;
    private DirectionStatus directionStatus;
    private ElevatorStatus elevatorStatus;

    public int getElevatorId() {
        return elevatorId;
    }

    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public ElevatorPanel getElevatorPanel() {
        return elevatorPanel;
    }

    public void setElevatorPanel(ElevatorPanel elevatorPanel) {
        this.elevatorPanel = elevatorPanel;
    }

    public ElevatorDisplay getElevatorDisplay() {
        return elevatorDisplay;
    }

    public void setElevatorDisplay(ElevatorDisplay elevatorDisplay) {
        this.elevatorDisplay = elevatorDisplay;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public Doors getDoor() {
        return door;
    }

    public void setDoor(Doors door) {
        this.door = door;
    }

    public Queue<Request>  getRequests() {
        return requests;
    }

    public void setRequests(Queue<Request>  requests) {
        this.requests = requests;
    }

    public DirectionStatus getDirectionStatus() {
        return directionStatus;
    }

    public void setDirectionStatus(DirectionStatus directionStatus) {
        this.directionStatus = directionStatus;
    }

    public ElevatorStatus getElevatorStatus() {
        return elevatorStatus;
    }

    public void setElevatorStatus(ElevatorStatus elevatorStatus) {
        this.elevatorStatus = elevatorStatus;
    }

    public boolean moveUp() {
        return true;
    }

    public boolean moveDown() {
        return false;
    }

    public boolean doorOpen() {
        return false;
    }

    public boolean doorClose() {
        return false;
    }

    public Queue<Request>  addRequest() {
        return requests;
    }

    public Queue<Request>  removeRequest() {
        return requests;
    }

    public boolean isFull() {
        return ((currentCapacity > maxCapacity) || (currentWeight> maxWeight));
    }
}
