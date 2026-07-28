package models;

import constants.DirectionStatus;
import interfaces.Button;

public class HallButton extends Button {
    private DirectionStatus directionStatus;

    public DirectionStatus getDirectionStatus() {
        return directionStatus;
    }

    public void setDirectionStatus(DirectionStatus directionStatus) {
        this.directionStatus = directionStatus;
    }

    @Override
    public void press() {

    }

    @Override
    public void isPressed() {

    }
}
