public class ElectricVehiclefactory implements IVehicleFactory {
    @Override
    public IBike createBike() {
        System.out.println("Creating new Electric Bike");
        return new ElectricBike();
    }

    @Override
    public ICar createCar() {
        System.out.println("Creating new Electric Car");
        return new ElectricCar();
    }
}
