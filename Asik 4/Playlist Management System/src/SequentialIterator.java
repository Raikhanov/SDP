import java.util.List;

class SequentialIterator implements Iterator {
    private List<Song> songs;
    private int position;

    public SequentialIterator(List<Song> songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
