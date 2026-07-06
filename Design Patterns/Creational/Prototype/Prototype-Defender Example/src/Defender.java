public class Defender implements IDefenderPrototype{

    DefenderEngine defenderEngine;

    public Defender(){
        this.defenderEngine = new DefenderEngine();
    }

    private Defender(DefenderEngine defenderEngine){
        this.defenderEngine = new DefenderEngine(defenderEngine);
    }

    @Override
    public IDefenderPrototype clone() {
        IDefenderPrototype prototype = new Defender(this.defenderEngine);
        return prototype;
    }

    @Override
    public void setEngine(DefenderEngine defenderEngine) {
        this.defenderEngine = defenderEngine;
    }
}
