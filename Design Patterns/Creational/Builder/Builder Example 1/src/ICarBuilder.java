import Model.ICar;

public interface ICarBuilder {
    void buildEngine();

    void buildTyres();

    void buildChassis();

    void buildBodyshell();

    ICar build();
}
