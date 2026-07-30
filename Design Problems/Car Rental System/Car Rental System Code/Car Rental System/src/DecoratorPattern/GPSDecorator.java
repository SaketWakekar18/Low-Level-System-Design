package DecoratorPattern;

public class GPSDecorator extends ReservationDecorator {

    public GPSDecorator(Reservation reservation) {
        super(reservation);
    }

    @Override
    public double calculateBill() {
        return reservation.calculateBill() + 400;
    }
}
