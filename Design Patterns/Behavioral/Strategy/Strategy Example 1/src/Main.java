public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(new UPIPayment());
        shoppingCart.checkout(1000);
    }
}