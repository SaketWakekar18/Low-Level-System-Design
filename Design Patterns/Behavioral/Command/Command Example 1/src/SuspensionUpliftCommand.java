public class SuspensionUpliftCommand implements Command{

    SuspensionUpliftMechanism suspensionUpliftMechanism;

    public SuspensionUpliftCommand(SuspensionUpliftMechanism suspensionUpliftMechanism){
        this.suspensionUpliftMechanism = suspensionUpliftMechanism;
    }

    @Override
    public void execute() {
        suspensionUpliftMechanism.uplift();
    }
}
