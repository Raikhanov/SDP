public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1", "Rock"));
        playlist.addSong(new Song("Song 2", "Pop"));
        playlist.addSong(new Song("Song 3", "Rock"));
        playlist.addSong(new Song("Song 4", "Jazz"));
        playlist.addSong(new Song("Song 5", "Pop"));

        System.out.println("Sequential Order:");
        Iterator sequentialIterator = playlist.createSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        System.out.println("\nShuffled Order:");
        Iterator shuffleIterator = playlist.createShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        System.out.println("\nFiltered by Genre (Pop):");
        Iterator genreIterator = playlist.createGenreFilterIterator("Pop");
        while (genreIterator.hasNext()) {
            System.out.println(genreIterator.next());
        }
    }
}