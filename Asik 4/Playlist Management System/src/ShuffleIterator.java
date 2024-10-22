import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ShuffleIterator implements Iterator {
    private List<Song> songs;
    private List<Integer> shuffledIndices;
    private int position;

    public ShuffleIterator(List<Song> songs) {
        this.songs = songs;
        this.shuffledIndices = new ArrayList<>();
        for (int i = 0; i < songs.size(); i++) {
            shuffledIndices.add(i);
        }
        shuffle();
        position = 0;
    }

    private void shuffle() {
        Random random = new Random();
        for (int i = shuffledIndices.size() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = shuffledIndices.get(index);
            shuffledIndices.set(index, shuffledIndices.get(i));
            shuffledIndices.set(i, temp);
        }
    }
    @Override
    public boolean hasNext() {
        return position < shuffledIndices.size();
    }

    @Override
    public Song next() {
        return songs.get(shuffledIndices.get(position++));
    }
}
