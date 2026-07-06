public class Main {
    public static void main(String[] args) {
        UiComponent component = new Menu();
        Button button = new Button();
        component.add(button);
        component.add(button);
        component.add(button);

        component.draw();
        System.out.println("After removing:");
        component.remove(button);
        component.draw();
        System.out.println("After Adding:");
        component.add(button);
        component.draw();
    }
}