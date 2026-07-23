public class InsuranceCarVisitor implements ICarVisitor{
    @Override
    public void visitScorpio(Scorpio scorpio) {
        System.out.println("Insurance Scorpio Visitor");
    }

    @Override
    public void visitAlto(Alto alto) {
        System.out.println("Insurance Alto Visitor");
    }
}
