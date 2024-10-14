public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(light, thermostat, securitySystem, entertainmentSystem);

        smartHomeFacade.arriveHome();
        smartHomeFacade.movieMode();
        smartHomeFacade.nightMode();
    }
}
