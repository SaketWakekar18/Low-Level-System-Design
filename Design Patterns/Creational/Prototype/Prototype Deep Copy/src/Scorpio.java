public class Scorpio implements IScorpioPrototype, Cloneable {

    ScorpioEngine scorpioEngine;

    public Scorpio() {
        this.scorpioEngine = new ScorpioEngine();
    }

    private Scorpio(ScorpioEngine scorpioEngine){
        this.scorpioEngine = new ScorpioEngine(scorpioEngine);
    }

    @Override
    public IScorpioPrototype clone() {
       IScorpioPrototype prototype = new Scorpio(this.scorpioEngine);
       return prototype;
    }

    @Override
    public void setEngine(ScorpioEngine scorpioEngine) {
        this.scorpioEngine = scorpioEngine;
    }
}
