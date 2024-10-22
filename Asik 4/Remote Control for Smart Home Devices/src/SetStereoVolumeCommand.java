class SetStereoVolumeCommand implements Command {
    Stereo stereo;
    int volume;

    public SetStereoVolumeCommand(Stereo stereo, int volume) {
        this.stereo = stereo;
        this.volume = volume;
    }

    public void execute() {
        stereo.on();
        stereo.setVolume(volume);
    }

    public void undo() {
        stereo.off();
    }
}
