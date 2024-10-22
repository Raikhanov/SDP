import java.util.List;

class GenreFilterIterator implements Iterator {
    private List<Song> songs;
    private String genre;
    private int position;

    public GenreFilterIterator(List<Song> songs, String genre) {
        this.songs = songs;
        this.genre = genre;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        while (position < songs.size()) {
            if (songs.get(position).getGenre().equalsIgnoreCase(genre)) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}