import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<IObserver> observerList = new ArrayList<>();

    void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    void notifyObservers() {
        System.out.println("Occupying slot");

        for (IObserver observer : observerList) {
            observer.update();
        }
    }
}
