public class Director extends Approver {
    public Director(Approver next) {
        super(next);
    }

    @Override
    void approve(int days) {
        System.out.println("Approved by Director");
    }
}
