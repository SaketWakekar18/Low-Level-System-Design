public class Main {
    public static void main(String[] args) {
        ATCTower tower = new ATCTower();
        Indigo indigo = new Indigo(tower);

        indigo.fly();

        indigo.land();
    }
}