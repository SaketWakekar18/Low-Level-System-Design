package models;

import constants.DirectionStatus;

public class HallPanel {
    private HallButton upButton;
    private HallButton downButton;
    private DirectionStatus directionStatus;

    public HallButton getUpButton() {
        return upButton;
    }

    public void setUpButton(HallButton upButton) {
        this.upButton = upButton;
    }

    public HallButton getDownButton() {
        return downButton;
    }

    public void setDownButton(HallButton downButton) {
        this.downButton = downButton;
    }

    public DirectionStatus getDirectionStatus() {
        return directionStatus;
    }

    public void setDirectionStatus(DirectionStatus directionStatus) {
        this.directionStatus = directionStatus;
    }

    public boolean pressedUp() {
        return false;
    }

    public boolean pressedDown() {
        return false;
    }
}
