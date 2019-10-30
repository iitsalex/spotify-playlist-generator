import java.util.ArrayList;

/*
    RESPONSIBILITIES:
    • Add/Remove Songs To/From Playlist 
    • Shuffle song order
    • Stores a collection of songs
*/
public class Playlist {

    public Playlist()
    {
        collection = new ArrayList<>();
    }

    public void add(Song s) {
        // Adding unique songs only
        if (!collection.contains(s)) {
            collection.add(s);
        }
    }

    public void remove(Song s) {
        collection.remove(collection.indexOf(s));
    }

    // Collection of songs
    private ArrayList<Song> collection;
}