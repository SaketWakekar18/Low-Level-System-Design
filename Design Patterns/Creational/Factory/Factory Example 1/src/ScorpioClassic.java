import Model.ScorpioClassicBodyShell;
import Model.ScorpioClassicEngine;

public class ScorpioClassic extends Scorpio {

    public void makeCar() {
        System.out.println("Making Scorpio Classic");
        iEngine = new ScorpioClassicEngine();
        iBodyShell = new ScorpioClassicBodyShell();
    }

    public void createEngine() {
        makeCar();
        System.out.println("Inside Scorpio Classic");
    }
}
