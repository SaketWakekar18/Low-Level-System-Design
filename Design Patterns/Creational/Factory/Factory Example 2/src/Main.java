public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Vehicle car = new Car();
        factory.createVehicle();
        car.start();

        factory = new BikeFactory();
        Vehicle bike = new Bike();
        factory.createVehicle();
        bike.start();

    }
}