import java.util.ArrayList;
import java.util.List;

class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public Iterator createSequentialIterator() {
        return new SequentialIterator(songs);
    }

    public Iterator createShuffleIterator() {
        return new ShuffleIterator(songs);
    }

    public Iterator createGenreFilterIterator(String genre) {
        return new GenreFilterIterator(songs, genre);
    }
}