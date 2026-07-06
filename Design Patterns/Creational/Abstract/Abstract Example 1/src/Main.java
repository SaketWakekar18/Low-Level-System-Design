import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        IVehicleFactory factory1 = new ScorpioFactory();
        IVehicleFactory factory2 = new DefenderFactory();

        Car car1 = new Car(factory1);
        Car car2 = new Car(factory2);

        Collection<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        for (Car c : cars) {
            c.drive();
        }
    }
}