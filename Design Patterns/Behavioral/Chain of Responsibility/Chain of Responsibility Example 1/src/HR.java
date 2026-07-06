public class HR extends Approver {
    public HR(Approver next) {
        super(next);
    }

    @Override
    void approve(int days) {
        if (days <= 2) {
            System.out.println("Approved by HR");
        } else {
            next.approve(days);
        }
    }
}
