public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        TV tv = new TV();
        Stereo stereo = new Stereo();

        TurnTVOnCommand tvOn = new TurnTVOnCommand(tv);
        TurnTVOffCommand tvOff = new TurnTVOffCommand(tv);
        SetStereoVolumeCommand stereoOn = new SetStereoVolumeCommand(stereo, 10);

        remote.setCommand(0, tvOn, tvOff);
        remote.setCommand(1, stereoOn, new Command() {
            public void execute() { stereo.off(); }
            public void undo() { stereo.on(); }
        });

        remote.pressOnButton(0);
        remote.pressOffButton(0);
        remote.pressUndoButton();

        remote.pressOnButton(1);
        remote.pressOffButton(1);
        remote.pressUndoButton();
    }
}