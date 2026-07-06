public class AircraftOne {

    private static AircraftOne instance;

    private AircraftOne() {
        System.out.println("Inside Aircraft One");
    }

    private static AircraftOne getInstance() {
        if (instance == null) {
            instance = new AircraftOne();
        }
        return instance;
    }

    public static void main(String[] args) {
        AircraftOne aircraftOne1 = AircraftOne.getInstance();
        AircraftOne aircraftOne2 = AircraftOne.getInstance();

        System.out.println(aircraftOne2 == aircraftOne1);

    }
}
