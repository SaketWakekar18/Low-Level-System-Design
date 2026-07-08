import java.util.ArrayList;
import java.util.List;

public class ATCTower implements ISubject{

    List<IObserver> observerList = new ArrayList<>();

    @Override
    public void addObserver(IObserver iObserver) {
        observerList.add(iObserver);
        System.out.println("Adding observer");
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        observerList.remove(iObserver);
        System.out.println("Removing Observer");
    }
}
