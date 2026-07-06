public class Main {
    public static void main(String[] args) {
        IVehicleFactory factory1 = new PetrolVehicleFactory();

        ICar car1 = factory1.createCar();
        IBike bike1 = factory1.createBike();

        car1.drive();
        bike1.ride();

        System.out.println();

        IVehicleFactory factory2 = new ElectricVehiclefactory();
        ICar car2 = factory2.createCar();
        IBike bike2 = factory2.createBike();

        car2.drive();
        bike2.ride();

    }
}