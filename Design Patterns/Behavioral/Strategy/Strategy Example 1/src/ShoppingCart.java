public class ShoppingCart {
    private IPayment payment;

    public ShoppingCart(IPayment payment){
        this.payment = payment;
    }

    public void checkout(int amount){
        payment.pay(amount);
    }
}
