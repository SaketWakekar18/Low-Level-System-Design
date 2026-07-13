public class F16HelicopterIterator implements CustomIterator{

    Airport airport;

    int index = 0;

    public F16HelicopterIterator(Airport airport) {
        this.airport = airport;
    }

    @Override
    public boolean hasNext() {
        return index<airport.helicopters.size();
    }

    @Override
    public Object next() {
        return airport.helicopters.get(index++);
    }
}
