public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.addJets(new Jet());
        airport.addJets(new Jet());
        airport.addJets(new Jet());

        CustomIterator jetIterator = airport.createJetIterator();
        while (jetIterator.hasNext()) {
            System.out.println(jetIterator.next());
        }

        airport.addCargo(new Cargo());
        airport.addCargo(new Cargo());
        airport.addCargo(new Cargo());

        CustomIterator cargoIterator = airport.createCargoIterator();
        while (cargoIterator.hasNext()) {
            System.out.println(cargoIterator.next());
        }

        airport.addHelicopters(new F16Helicopter());
        airport.addHelicopters(new F16Helicopter());
        airport.addHelicopters(new F16Helicopter());

        CustomIterator helicopterIterator = airport.createHelicopterIterator();
        while (helicopterIterator.hasNext()) {
            System.out.println(helicopterIterator.next());
        }

    }
}