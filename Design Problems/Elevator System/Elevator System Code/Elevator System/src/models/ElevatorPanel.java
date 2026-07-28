package models;

import java.util.List;

public class ElevatorPanel {
    private List<ElevatorButton> elevatorButtons;
    private ElevatorButton doorOpenButton;
    private ElevatorButton doorCloseButton;
    private ElevatorButton emergencyButton;
    private Doors doors;

    public List<ElevatorButton> getElevatorButtons() {
        return elevatorButtons;
    }

    public void setElevatorButtons(List<ElevatorButton> elevatorButtons) {
        this.elevatorButtons = elevatorButtons;
    }

    public ElevatorButton getDoorOpenButton() {
        return doorOpenButton;
    }

    public void setDoorOpenButton(ElevatorButton doorOpenButton) {
        this.doorOpenButton = doorOpenButton;
    }

    public ElevatorButton getDoorCloseButton() {
        return doorCloseButton;
    }

    public void setDoorCloseButton(ElevatorButton doorCloseButton) {
        this.doorCloseButton = doorCloseButton;
    }

    public ElevatorButton getEmergencyButton() {
        return emergencyButton;
    }

    public void setEmergencyButton(ElevatorButton emergencyButton) {
        this.emergencyButton = emergencyButton;
    }

    public List<ElevatorButton> getDestinationFloors() {
        return elevatorButtons;
    }

    public boolean isDoorOpen() {
        return doors.isOpen();
    }

    public boolean isDoorClose() {
        return doors.isClosed();
    }
}
