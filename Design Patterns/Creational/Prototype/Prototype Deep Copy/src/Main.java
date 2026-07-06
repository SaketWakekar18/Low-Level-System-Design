public class Main {
    public static void main(String[] args) {
        IScorpioPrototype scorpioN = new ScorpioNEngine();
        scorpioN.clone();

        IScorpioPrototype scorpioClassic = new ScorpioClassicEngine();
        scorpioClassic.clone();
    }
}