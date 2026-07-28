package models;

import interfaces.Button;

import java.util.List;

public class ElevatorButton extends Button {
    private List<Integer> destinationFloorNumbers;

    public List<Integer> getDestinationFloorNumbers() {
        return destinationFloorNumbers;
    }

    public void setDestinationFloorNumbers(List<Integer> destinationFloorNumbers) {
        this.destinationFloorNumbers = destinationFloorNumbers;
    }

    @Override
    public void press() {

    }

    @Override
    public void isPressed() {

    }
}
