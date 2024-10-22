class NewOrderState implements OrderState {
    private Order order;

    public NewOrderState(Order order) {
        this.order = order;
    }

    public void payOrder() {
        System.out.println("Order has been paid.");
        order.setState(order.getPaidState());
    }

    public void shipOrder() {
        System.out.println("Cannot ship the order, it's not paid yet.");
    }

    public void deliverOrder() {
        System.out.println("Cannot deliver the order, it's not shipped yet.");
    }

    public void cancelOrder() {
        System.out.println("Order has been canceled.");
        order.setState(order.getCancelledState());
    }
}