public class Main {
    public static void main(String[] args) {
        AbstractScorpio scorpio = new ScorpioN(new ScorpioN_Impl_India());
        scorpio.printSafetyRequirements();
        System.out.println(scorpio.isRightHanded());

        AbstractScorpio scorpio2 = new ScorpioN(new ScorpioN_Impl_USA());
        scorpio2.printSafetyRequirements();
        System.out.println(scorpio2.isRightHanded());
    }
}