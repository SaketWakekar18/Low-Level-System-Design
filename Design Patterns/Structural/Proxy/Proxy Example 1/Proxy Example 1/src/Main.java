import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RCProxy rcProxy = new RCProxy();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the action: ");
            String action = sc.next();
            switch (action) {
                case "left":
                    rcProxy.goLeft();
                    break;
                case "right":
                    rcProxy.goRight();
                    break;
                case "straight":
                    rcProxy.goStraight();
                    break;
                case "exit":
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}