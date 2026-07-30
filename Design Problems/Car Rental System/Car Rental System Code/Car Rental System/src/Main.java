import DecoratorPattern.*;
import FactoryMethod.*;
import constants.CarType;
import constants.MotorCycleType;
import constants.TruckType;
import constants.VanType;
import models.Branch;
import models.Receptionist;

public class Main {
    public static void main(String[] args) {
        Receptionist receptionist = new Receptionist();
        Branch branch = new Branch();
        VehicleFactory vehicleFactory = new TruckFactory(TruckType.HEAVY);

        receptionist.addVehicle(branch, vehicleFactory);

        Reservation reservation = new BasicReservation();
        System.out.println(reservation.calculateBill());

        GPSDecorator gpsDecorator = new GPSDecorator(reservation);
        System.out.println(gpsDecorator.calculateBill());

        ChildSeatDecorator childSeatDecorator = new ChildSeatDecorator(reservation);
        System.out.println(childSeatDecorator.calculateBill());

    }
}