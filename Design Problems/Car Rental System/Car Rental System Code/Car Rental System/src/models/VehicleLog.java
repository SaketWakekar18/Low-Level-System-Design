package models;

import constants.LogAction;

import java.util.Date;

public class VehicleLog {
    private int logId;
    private LogAction logAction;
    private String description;
    private Date timestamp;
    private VehicleReservation vehicleRegistration;

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public LogAction getLogAction() {
        return logAction;
    }

    public void setLogAction(LogAction logAction) {
        this.logAction = logAction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public VehicleReservation getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(VehicleReservation vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public void showLogs() {

    }
}
