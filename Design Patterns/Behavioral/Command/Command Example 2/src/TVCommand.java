public class TVCommand implements Command {
    private TV tv;

    public TVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
