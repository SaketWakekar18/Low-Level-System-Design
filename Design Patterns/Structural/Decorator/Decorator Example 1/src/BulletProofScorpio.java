public class BulletProofScorpio implements ScorpioDecorator{
    ICar car;

    public BulletProofScorpio(ICar car) {
        this.car = car;
    }

    public void start() {
        car.start();
    }

    public void stop() {
        car.stop();
    }

    public float getWeight() {
        return 500f + car.getWeight();
    }
}
