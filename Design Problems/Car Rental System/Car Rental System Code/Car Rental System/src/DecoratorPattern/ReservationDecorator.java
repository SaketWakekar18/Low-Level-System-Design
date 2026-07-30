package DecoratorPattern;

public abstract class ReservationDecorator implements Reservation {

    protected Reservation reservation;

    public ReservationDecorator(Reservation reservation) {
        this.reservation = reservation;
    }

}
