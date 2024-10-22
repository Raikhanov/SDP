public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("\n--- Initial Order State: New ---");
        order.payOrder();

        System.out.println("\n--- Order is now Paid ---");
        order.shipOrder();

        System.out.println("\n--- Order is now Shipped ---");
        order.deliverOrder();

        System.out.println("\n--- Order is now Delivered ---");
        order.cancelOrder();
    }
}