import Model.DefenderEngine;
import Model.IEngine;

public class DefenderFactory implements IVehicleFactory {
    @Override
    public IEngine createEngine() {
        System.out.println("Inside Defender Factory");
        return new DefenderEngine();
    }
}
