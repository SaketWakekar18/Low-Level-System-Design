public class JetIterator implements CustomIterator {
    Airport airport;
    int index = 0;

    public JetIterator(Airport airport) {
        this.airport = airport;
    }

    @Override
    public boolean hasNext() {
        return index < airport.jets.size();
    }

    @Override
    public Object next() {
        return airport.jets.get(index++);
    }
}
