import Model.IEngine;
import Model.ScorpioEngine;

public class ScorpioFactory implements IVehicleFactory{
    @Override
    public IEngine createEngine() {
        System.out.println("Inside Scorpio Factory");
        return new ScorpioEngine();
    }
}
