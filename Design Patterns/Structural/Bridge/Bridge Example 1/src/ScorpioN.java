public class ScorpioN extends AbstractScorpio{

    public ScorpioN(AbstractScorpioImpl abstractScorpio) {
        super(abstractScorpio);
    }

    @Override
    void printSafetyRequirements() {
        abstractScorpio.printSafetyRequirements();
    }

    @Override
    boolean isRightHanded() {
        return abstractScorpio.isRightHanded();
    }
}
