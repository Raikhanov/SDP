class CancelledOrderState implements OrderState {
    private Order order;

    public CancelledOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Can't pay for a canceled order.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Can't ship a canceled order.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Can't deliver a canceled order.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order is already canceled.");
    }
}
