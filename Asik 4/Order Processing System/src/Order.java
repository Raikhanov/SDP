class Order {
    private OrderState newState;
    private OrderState paidState;
    private OrderState shippedState;
    private OrderState deliveredState;
    private OrderState cancelledState;
    private OrderState currentState;

    public Order() {
        newState = new NewOrderState(this);
        paidState = new PaidOrderState(this);
        shippedState = new ShippedOrderState(this);
        deliveredState = new DeliveredOrderState(this);
        cancelledState = new CancelledOrderState(this);
        currentState = newState;
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void payOrder() {
        currentState.payOrder();
    }

    public void shipOrder() {
        currentState.shipOrder();
    }

    public void deliverOrder() {
        currentState.deliverOrder();
    }

    public void cancelOrder() {
        currentState.cancelOrder();
    }

    public OrderState getNewState() {
        return newState;
    }

    public OrderState getPaidState() {
        return paidState;
    }

    public OrderState getShippedState() {
        return shippedState;
    }

    public OrderState getDeliveredState() {
        return deliveredState;
    }

    public OrderState getCancelledState() {
        return cancelledState;
    }
}
