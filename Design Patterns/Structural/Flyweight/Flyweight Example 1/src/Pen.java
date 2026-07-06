public class Pen {
    String color;

    public Pen(String color) {
        this.color = color;
    }

    public void display(String student) {
        System.out.println(student + " is writing with " + color + " pen");
    }
}
