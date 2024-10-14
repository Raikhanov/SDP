public class ProxyVideoLecture implements VideoLecture {
    private String title;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String title) {
        this.title = title;
    }

    @Override
    public void getInfo() {
        System.out.println("Video Title: " + title);
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(title);
        }
        realVideoLecture.play();
    }
}
