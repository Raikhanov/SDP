public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        light.off();
        thermostat.setTemperature(18);
        securitySystem.arm();
        System.out.println("You left home.");
    }

    public void arriveHome() {
        light.on();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        System.out.println("You arrived home.");
    }

    public void nightMode() {
        light.off();
        thermostat.setTemperature(20);
        securitySystem.arm();
        System.out.println("Night mode activated.");
    }

    public void movieMode() {
        light.off();
        entertainmentSystem.playMovie("Inception");
        System.out.println("Movie mode activated.");
    }
}
