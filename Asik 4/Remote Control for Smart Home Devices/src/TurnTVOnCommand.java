class TurnTVOnCommand implements Command {
    TV tv;

    public TurnTVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}