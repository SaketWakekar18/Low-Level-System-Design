public class MusicSystemDecorator extends ScorpioDecorator {
    public MusicSystemDecorator(ICar iCar) {
        super(iCar);
    }

    public void features() {
        super.features();
        System.out.println("Inside Music system Scorpio");
    }
}
