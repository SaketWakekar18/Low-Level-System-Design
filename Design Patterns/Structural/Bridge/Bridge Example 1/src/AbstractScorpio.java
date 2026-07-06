public abstract class AbstractScorpio {

    AbstractScorpioImpl abstractScorpio;

    public AbstractScorpio(AbstractScorpioImpl abstractScorpio) {
        this.abstractScorpio = abstractScorpio;
    }

    abstract void printSafetyRequirements();

    abstract boolean isRightHanded();
}
