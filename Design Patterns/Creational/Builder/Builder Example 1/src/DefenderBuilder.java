import Model.Defender;
import Model.ICar;

public class DefenderBuilder implements ICarBuilder{

    @Override
    public void buildEngine() {
        System.out.println("Building Defender Engine");
    }

    @Override
    public void buildTyres() {
        System.out.println("Building Defender Tyres");
    }

    @Override
    public void buildChassis() {
        System.out.println("Building Defender Chassis");
    }

    @Override
    public void buildBodyshell() {
        System.out.println("Building Defender BodyShell");
    }

    @Override
    public ICar build() {
        return new Defender();
    }
}
