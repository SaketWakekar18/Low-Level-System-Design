package models;

import java.util.List;

public class ElevatorSystem {
    private static volatile ElevatorSystem elevatorSystemInstance = null;
    private List<Elevator> elevators;
    private Dispatcher dispatcher;

    private ElevatorSystem() {

    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void monitorElevator() {

    }

    public void handleRequests(Request requests) {

    }

    public static ElevatorSystem getInstance() {
        if (elevatorSystemInstance == null) {
            synchronized ((ElevatorSystem.class)) {
                if (elevatorSystemInstance == null) {
                    elevatorSystemInstance = new ElevatorSystem();
                }
            }
        }
        return elevatorSystemInstance;
    }
}
