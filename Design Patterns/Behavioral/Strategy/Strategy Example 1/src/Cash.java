public class Cash implements IPayment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount +" using Cash");
    }
}
