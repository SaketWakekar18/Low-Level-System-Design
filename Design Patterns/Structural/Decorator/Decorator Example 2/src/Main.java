public class Main {
    public static void main(String[] args) {
        ICar car = new Scorpio();
        car = new SunroofDecorator(car);
        car = new MusicSystemDecorator(car);

        car.features();
    }
}