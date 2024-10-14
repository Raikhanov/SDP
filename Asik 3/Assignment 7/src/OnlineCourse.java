import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private List<VideoLecture> lectures = new ArrayList<>();

    public void addLecture(VideoLecture lecture) {
        lectures.add(lecture);
    }

    public void showLectures() {
        for (VideoLecture lecture : lectures) {
            lecture.getInfo();
        }
    }

    public void playLecture(int index) {
        lectures.get(index).play();
    }
}
