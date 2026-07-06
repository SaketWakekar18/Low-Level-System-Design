public class ScorpioFactory {
    Scorpio createEngine(String type) {
        switch (type) {
            case "N": return new ScorpioN();
            case "C": return new ScorpioClassic();
            default:return new Scorpio();
        }
        //simple factory
    }
}
