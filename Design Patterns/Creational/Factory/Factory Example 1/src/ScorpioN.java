import Model.ScorpioNBodyShell;
import Model.ScorpioNEngine;

public class ScorpioN extends Scorpio {

    public void makeCar() {
        System.out.println("Making Scorpio N");
        iEngine = new ScorpioNEngine();
        iBodyShell = new ScorpioNBodyShell();
    }

    public void createEngine() {
        makeCar();
        System.out.println("Inside Scorpio N");
    }
}
