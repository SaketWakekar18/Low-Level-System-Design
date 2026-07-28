package models;

import constants.DoorStatus;

public class Doors {
    private DoorStatus doorStatus;

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void setDoorStatus(DoorStatus doorStatus) {
        this.doorStatus = doorStatus;
    }

    public boolean isOpen() {
        return false;
    }

    public boolean isClosed() {
        return false;
    }
}
