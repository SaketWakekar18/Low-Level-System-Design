public class Plane {
    ATCController atcController;

    private final String name;
    private final IMediator mediator;

    public Plane(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void land() {
        System.out.println(name + " requesting to land");
        mediator.requestForLanding(name);
    }
}
