public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Using Credit Card payment
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100.00);

        // Using PayPal payment
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200.00);

        // Using Cryptocurrency payment
        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(300.00);
    }
}