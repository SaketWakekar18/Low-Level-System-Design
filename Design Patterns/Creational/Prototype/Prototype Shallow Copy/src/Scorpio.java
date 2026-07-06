public class Scorpio implements IScorpioPrototype, Cloneable {

    ScorpioEngine scorpioEngine = new ScorpioEngine();

    @Override
    public IScorpioPrototype clone() {
        return new Scorpio();
    }

    @Override
    public void setEngine(ScorpioEngine scorpioEngine) {
        this.scorpioEngine = scorpioEngine;
    }
}
