public class SoundSystemDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("Sound system is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound system is OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound system channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Sound system volume set to " + volume);
    }
}
