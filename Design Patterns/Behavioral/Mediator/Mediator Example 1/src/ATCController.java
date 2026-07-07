public class ATCController implements IMediator {

    @Override
    public synchronized void requestForLanding(String planeName) {
        System.out.println("ATC: " + planeName + " is allowed to land");
    }
}
