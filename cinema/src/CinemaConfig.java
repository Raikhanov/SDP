public class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;
    private int numberOfScreens;

    private CinemaConfig() {}

    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public void setCinemaName(String name) {
        this.cinemaName = name;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setNumberOfScreens(int number) {
        this.numberOfScreens = number;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }
}