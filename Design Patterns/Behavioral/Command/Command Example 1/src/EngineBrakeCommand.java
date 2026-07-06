public class EngineBrakeCommand implements Command {

    EngineBrakingMechanism engineBrakingMechanism;

    public EngineBrakeCommand(EngineBrakingMechanism engineBrakingMechanism) {
        this.engineBrakingMechanism = engineBrakingMechanism;
    }

    @Override
    public void execute() {
        engineBrakingMechanism.applyBreak();
    }
}
