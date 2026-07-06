public class Main {
    public static void main(String[] args) {
        HotAirBaloon hotAirBaloon = new HotAirBaloon();
        Adaptor adaptor = new Adaptor(hotAirBaloon);
        adaptor.start();

    }
}