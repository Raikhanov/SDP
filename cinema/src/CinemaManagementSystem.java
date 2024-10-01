import java.util.Scanner;

public class CinemaManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Singleton: настройка кинотеатра
        CinemaConfig config = CinemaConfig.getInstance();
        System.out.print("Введите название кинотеатра: ");
        config.setCinemaName(scanner.nextLine());
        System.out.print("Введите количество экранов: ");
        config.setNumberOfScreens(scanner.nextInt());
        scanner.nextLine(); // чистим буфер
        System.out.println("Кинотеатр: " + config.getCinemaName() + ", Экраны: " + config.getNumberOfScreens());

        // Factory Method: создание фильма
        System.out.print("Введите тип фильма (1 - Обычный, 2 - IMAX): ");
        int movieType = scanner.nextInt();
        scanner.nextLine(); // чистим буфер
        System.out.print("Введите название фильма: ");
        String movieTitle = scanner.nextLine();

        MovieFactory movieFactory = (movieType == 1) ? new RegularMovieFactory() : new IMAXMovieFactory();
        Movie movie = movieFactory.createMovie(movieTitle);
        System.out.println("Создан фильм: " + movie.getTitle());

        // Abstract Factory: выбор темы интерфейса
        System.out.print("Выберите тему (1 - Тёмная, 2 - Светлая): ");
        int themeType = scanner.nextInt();
        UIFactory uiFactory = (themeType == 1) ? new DarkThemeFactory() : new LightThemeFactory();
        Button button = uiFactory.createButton();
        button.render();

        // Builder: бронирование билета
        TicketBooking booking = new TicketBooking.TicketBookingBuilder()
                .setMovieTitle(movie.getTitle())
                .setSeatNumber("A1")
                .setSnackCombo("Попкорн + Кола")
                .build();
        System.out.println("Бронирование: " + booking);

        // Prototype: клонирование расписания
        StandardSchedule schedule = new StandardSchedule(movie.getTitle(), "18:00");
        StandardSchedule clonedSchedule = (StandardSchedule) schedule.clone();
        clonedSchedule.setTime("21:00");
        System.out.println("Оригинальное расписание: " + schedule);
        System.out.println("Склонированное расписание: " + clonedSchedule);

        scanner.close();
    }
}