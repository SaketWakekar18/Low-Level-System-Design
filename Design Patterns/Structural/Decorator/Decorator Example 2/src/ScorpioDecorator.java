public abstract class ScorpioDecorator implements ICar {
    public ICar iCar;

    public ScorpioDecorator(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void features() {
        iCar.features();
    }
}
