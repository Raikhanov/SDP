class StatisticsDisplay implements WeatherDisplay {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Statistics display: Avg/Min/Max temperature: " + temperature + "C.");
    }
}