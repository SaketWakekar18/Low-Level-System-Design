public class RCScorpio implements ICar{
    @Override
    public void goLeft() {
        System.out.println("Turning Left in RC Scorpio");
    }

    @Override
    public void goRight() {
        System.out.println("Turning Right in RC Scorpio");
    }

    @Override
    public void goStraight() {
        System.out.println("Going straight in RC Scorpio");
    }
}
