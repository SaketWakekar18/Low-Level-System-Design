public class Manager extends Approver {
    public Manager(Approver next) {
        super(next);
    }

    @Override
    void approve(int days) {
        if (days >= 2 && days <= 5) {
            System.out.println("Approved by Manager");
        }
        else{
            next.approve(days);
        }
    }
}
