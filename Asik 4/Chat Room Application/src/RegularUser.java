class RegularUser extends User {
    public RegularUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String message) {
        System.out.println(this.name + ": Sending Message=" + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(this.name + ": Received Message=" + message);
    }
}
