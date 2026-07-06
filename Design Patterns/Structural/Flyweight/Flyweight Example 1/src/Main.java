public class Main {
    public static void main(String[] args) {
        Pen pen1 = PenFactory.getPen("Blue");
        Pen pen2 = PenFactory.getPen("Blue");
        Pen pen3 = PenFactory.getPen("Green");

        pen1.display("Saket");
        pen2.display("Rohan");
        pen3.display("Mohan");
    }
}