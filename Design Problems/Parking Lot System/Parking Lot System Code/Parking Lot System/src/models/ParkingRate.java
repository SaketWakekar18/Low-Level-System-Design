package models;

public class ParkingRate {
    private double hours;
    private double price;

    public double calculateAmount() {
        return price * hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
