package models;

import constants.DirectionStatus;

public class Request {
    private int currentFloor;
    private int destinationFloor;
    private DirectionStatus directionStatus;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public DirectionStatus getDirectionStatus() {
        return directionStatus;
    }

    public void setDirectionStatus(DirectionStatus directionStatus) {
        this.directionStatus = directionStatus;
    }
}
