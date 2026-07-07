public class Main {
    public static void main(String[] args) {
        IMediator mediator = new ATCController();
        Plane airIndia = new Plane("Air India", mediator);
        Plane indigo = new Plane("Indigo", mediator);

        airIndia.land();
        indigo.land();
    }
}