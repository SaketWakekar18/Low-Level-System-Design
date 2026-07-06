public class SunroofDecorator extends ScorpioDecorator {
    public SunroofDecorator(ICar iCar) {
        super(iCar);
    }

    @Override
    public void features() {
        super.features();
        System.out.println("Inside Sunroof Scorpio");
    }
}
