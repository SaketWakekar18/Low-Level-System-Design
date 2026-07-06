public class RCProxy implements ICar{
    RCScorpio rcScorpio = new RCScorpio();
    @Override
    public void goLeft() {
        System.out.println("Turning Left in RC Proxy");
        rcScorpio.goLeft();
    }

    @Override
    public void goRight() {
        System.out.println("Turning Right in RC Proxy");
        rcScorpio.goRight();
    }

    @Override
    public void goStraight() {
        System.out.println("Going straight in RC Proxy");
        rcScorpio.goStraight();
    }
}
