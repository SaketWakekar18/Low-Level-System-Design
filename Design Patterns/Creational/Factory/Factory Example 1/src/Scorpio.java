import Model.*;

public class Scorpio {

    IEngine iEngine;
    IBodyShell iBodyShell;

    public void makeCar(){
        System.out.println("Making Scorpio");
        iEngine = new ScorpioEngine();
        iBodyShell = new ScorpioBodyShell();
    }

    public void createEngine() {
        makeCar();
        System.out.println("Inside Scorpio");
    }
}
