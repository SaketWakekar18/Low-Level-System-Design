import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Airport {
    List<Jet> jets = new ArrayList<>();
    Cargo[] cargoPlanes = new Cargo[5];
    int cargoIndex = 0;

    LinkedList<F16Helicopter> helicopters = new LinkedList<>();

    public void addJets(Jet jet) {
        jets.add(jet);
    }

    public void addCargo(Cargo cargo) {
        cargoPlanes[cargoIndex++] = cargo;
    }

    public void addHelicopters(F16Helicopter f16Helicopter) {
        helicopters.add(f16Helicopter);
    }

    public CustomIterator createJetIterator() {
        return new JetIterator(this);
    }

    public CustomIterator createCargoIterator() {
        return new CargoIterator(this);
    }

    public CustomIterator createHelicopterIterator() {
        return new F16HelicopterIterator(this);
    }
}
