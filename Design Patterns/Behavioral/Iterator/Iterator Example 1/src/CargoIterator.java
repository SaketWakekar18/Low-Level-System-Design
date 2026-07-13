public class CargoIterator implements CustomIterator {

    public Airport airport;

    int index = 0;

    public CargoIterator(Airport airport) {
        this.airport = airport;
    }

    @Override
    public boolean hasNext() {
        return index < airport.cargoIndex;
    }

    @Override
    public Object next() {
        return airport.cargoPlanes[index++];
    }
}
