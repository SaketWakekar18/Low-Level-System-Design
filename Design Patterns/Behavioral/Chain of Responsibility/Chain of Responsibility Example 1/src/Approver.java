public abstract class Approver {
    protected Approver next;

    public Approver(Approver next) {
        this.next = next;
    }

    abstract void approve(int days);

}
