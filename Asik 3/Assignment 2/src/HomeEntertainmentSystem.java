public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.turnOn();
        basicRemote.turnOff();

        Device dvd = new DVDDevice();
        RemoteControl advancedRemote = new AdvancedRemote(dvd);
        advancedRemote.turnOn();
        advancedRemote.turnOff();
        ((AdvancedRemote) advancedRemote).mute();
    }
}