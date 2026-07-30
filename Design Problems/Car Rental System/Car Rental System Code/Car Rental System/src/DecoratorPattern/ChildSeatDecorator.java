package DecoratorPattern;

public class ChildSeatDecorator extends ReservationDecorator {
    public ChildSeatDecorator(Reservation reservation) {
        super(reservation);
    }

    @Override
    public double calculateBill() {
        return reservation.calculateBill() + 200;
    }
}
