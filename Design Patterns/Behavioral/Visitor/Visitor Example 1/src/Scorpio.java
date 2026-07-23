public class Scorpio implements ICar {
    @Override
    public void accept(ICarVisitor iCarVisitor) {
        iCarVisitor.visitScorpio(this);
    }
}
