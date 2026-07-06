public class Director {
    public ICarBuilder iCarBuilder;

    public Director(ICarBuilder iCarBuilder) {
        this.iCarBuilder = iCarBuilder;
    }

    public void construct() {
        iCarBuilder.buildEngine();
        iCarBuilder.buildTyres();
        iCarBuilder.buildChassis();
        iCarBuilder.buildBodyshell();
    }
}
