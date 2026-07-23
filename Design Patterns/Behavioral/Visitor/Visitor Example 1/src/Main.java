import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        ICar scorpio = new Scorpio();
        fleet.addCar(scorpio);

        ICar alto = new Alto();
        fleet.addCar(alto);

        Iterator<ICar> iterator = fleet.getIterator();

        ICarVisitor visitor = new InsuranceCarVisitor();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

}