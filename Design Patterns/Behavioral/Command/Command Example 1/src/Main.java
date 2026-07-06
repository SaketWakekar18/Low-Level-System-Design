public class Main {
    public static void main(String[] args) {
        EngineBrakingMechanism engineBrakingMechanism = new EngineBrakingMechanism();
        SuspensionUpliftMechanism suspensionUpliftMechanism = new SuspensionUpliftMechanism();

        EngineBrakeCommand engineBrakeCommand = new EngineBrakeCommand(engineBrakingMechanism);
        SuspensionUpliftCommand suspensionUpliftCommand = new SuspensionUpliftCommand(suspensionUpliftMechanism);

        Panel panel = new Panel();
        panel.setCmd(1, engineBrakeCommand);
        panel.setCmd(0,suspensionUpliftCommand);

        panel.applyBrake();
        panel.upliftSuspension();
    }
}