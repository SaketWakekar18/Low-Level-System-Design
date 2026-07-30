package DecoratorPattern;

public class BasicReservation implements Reservation {
    @Override
    public double calculateBill() {
        return 1000;
    }
}
