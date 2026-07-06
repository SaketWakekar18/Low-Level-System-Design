public class Remote {
    private final Command command;

    public Remote(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}
