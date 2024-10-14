public class RealVideoLecture implements VideoLecture {
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading video: " + title);
    }

    @Override
    public void getInfo() {
        System.out.println("Video Title: " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
