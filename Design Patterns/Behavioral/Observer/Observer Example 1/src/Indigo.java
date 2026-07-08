public class Indigo implements IObserver {

    ISubject iSubject;

    public Indigo(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void land() {
        System.out.println("Landing");
        iSubject.removeObserver(this);

    }

    @Override
    public void fly() {
        iSubject.addObserver(this);
        System.out.println("Take-off");
    }
}
