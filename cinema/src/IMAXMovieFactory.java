public class IMAXMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new IMAXMovie(title);
    }
}
