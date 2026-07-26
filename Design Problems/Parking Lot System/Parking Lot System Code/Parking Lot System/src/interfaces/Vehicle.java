package interfaces;

public abstract class Vehicle {
    private String licenceNumber;

    public abstract void assignTicket();

    public abstract  void removeTicket();

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
}
