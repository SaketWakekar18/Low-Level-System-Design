package models;

import java.util.List;

public class Floor {
    private List<HallDisplay> hallDisplays;
    private List<HallPanel> hallPanels;
    private int currentFloor;

    public List<HallDisplay> getHallDisplays() {
        return hallDisplays;
    }

    public void setHallDisplays(List<HallDisplay> hallDisplays) {
        this.hallDisplays = hallDisplays;
    }

    public List<HallPanel> getHallPanels() {
        return hallPanels;
    }

    public void setHallPanels(List<HallPanel> hallPanels) {
        this.hallPanels = hallPanels;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

}
