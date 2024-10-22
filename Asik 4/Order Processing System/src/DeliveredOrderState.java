class DeliveredOrderState implements OrderState {
    private Order order;

    public DeliveredOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already delivered, no need to pay again.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is already delivered, can't ship again.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Can't cancel the order, it's already delivered.");
    }
}