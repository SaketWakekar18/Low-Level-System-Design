public class PetrolVehicleFactory implements IVehicleFactory {
    @Override
    public IBike createBike() {
        System.out.println("Creating new Petrol Bike");
        return new PetrolBike();
    }

    @Override
    public ICar createCar() {
        System.out.println("Creating new Petrol Car");
        return new PetrolCar();
    }
}
