class ShippedOrderState implements OrderState {
    private Order order;

    public ShippedOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is now Delivered.");
        order.setState(order.getDeliveredState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Can't cancel the order, it has already been shipped.");
    }
}