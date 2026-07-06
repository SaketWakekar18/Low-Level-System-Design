public class Button implements UiComponent{
    @Override
    public void draw() {
        System.out.println("Drawing button");
    }

    @Override
    public void add(UiComponent uiComponent) {
        System.out.println("Adding button");
    }

    @Override
    public void remove(UiComponent uiComponent) {
        System.out.println("Removing button");
    }
}
