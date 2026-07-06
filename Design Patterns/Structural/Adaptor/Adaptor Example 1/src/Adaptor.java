public class Adaptor implements ICar {
    HotAirBaloon hotAirBaloon;

    public Adaptor(HotAirBaloon hotAirBaloon) {
        this.hotAirBaloon = hotAirBaloon;
    }

    @Override
    public void start() {
        String gasToBeUsed = hotAirBaloon.getGasUsed();
        hotAirBaloon.start(gasToBeUsed);
    }
}
