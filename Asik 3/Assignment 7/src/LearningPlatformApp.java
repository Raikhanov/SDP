public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();

        course.addLecture(new ProxyVideoLecture("Calculs - Part 1"));
        course.addLecture(new ProxyVideoLecture("Design Patterns - Part 2"));

        System.out.println("Available lectures:");
        course.showLectures();

        System.out.println("\nPlaying lecture 1:");
        course.playLecture(0);

        System.out.println("\nPlaying lecture 2:");
        course.playLecture(1);
    }
}
