import Model.ICar;
import Model.Scorpio;

public class ScorpioBuilder implements ICarBuilder{

    @Override
    public void buildEngine() {
        System.out.println("Building Scorpio Engine");
    }

    @Override
    public void buildTyres() {
        System.out.println("Building Scorpio Tyres");
    }

    @Override
    public void buildChassis() {
        System.out.println("Building Scorpio Chassis");
    }

    @Override
    public void buildBodyshell() {
        System.out.println("Building Scorpio BodyShell");
    }

    @Override
    public ICar build() {
        return new Scorpio();
    }

}
