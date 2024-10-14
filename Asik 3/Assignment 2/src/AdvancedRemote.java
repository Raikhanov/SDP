public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.powerOn();
    }

    @Override
    public void turnOff() {
        device.powerOff();
    }

    public void mute() {
        device.setVolume(0);
    }
}
