public class Main {
    public static void main(String[] args) {
        ICarBuilder iCarBuilder = new ScorpioBuilder();
        Director dc = new Director(iCarBuilder);
        dc.construct();
        iCarBuilder.build();

        System.out.println();

        ICarBuilder iCarBuilder2 = new DefenderBuilder();
        Director dc2 = new Director(iCarBuilder2);
        dc2.construct();
        iCarBuilder2.build();
    }

}