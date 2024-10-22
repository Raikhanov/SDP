public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        station.addObserver(currentDisplay);
        station.addObserver(statisticsDisplay);

        station.setMeasurements(25.5f, 65f, 1013f);
        station.setMeasurements(27.3f, 70f, 1010f);
    }
}