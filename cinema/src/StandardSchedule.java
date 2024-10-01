public class StandardSchedule implements MovieSchedule {
    private String movie;
    private String time;

    public StandardSchedule(String movie, String time) {
        this.movie = movie;
        this.time = time;
    }

    public MovieSchedule clone() {
        return new StandardSchedule(this.movie, this.time);
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "StandardSchedule [movie=" + movie + ", time=" + time + "]";
    }
}
