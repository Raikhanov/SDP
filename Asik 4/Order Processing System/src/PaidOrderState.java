class PaidOrderState implements OrderState {
    private Order order;

    public PaidOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is now Shipped.");
        order.setState(order.getShippedState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Can't deliver the order, it hasn't been shipped yet.");
    }

    @Override
    public void cancelOrder() {

    }
}
