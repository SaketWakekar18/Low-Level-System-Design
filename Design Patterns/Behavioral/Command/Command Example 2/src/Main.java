public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        TVCommand command = new TVCommand(tv);
        Remote remote = new Remote(command);
        remote.pressButton();
    }
}