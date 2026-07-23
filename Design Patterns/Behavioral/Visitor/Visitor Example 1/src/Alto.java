public class Alto implements ICar {
    @Override
    public void accept(ICarVisitor iCarVisitor) {
        iCarVisitor.visitAlto(this);
    }
}
