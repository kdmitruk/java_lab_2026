package music;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistTest {
    @Test
    public void testEmptyPlaylist() {
        Playlist playlist = new Playlist();
        assertTrue (playlist.isEmpty());
    }
    @Test
    public void testSingleElement() {
        Playlist playlist = new Playlist();
        playlist.add(new Song("Daria Zawiałow", "Pank fu", 183));
        assertEquals(1, playlist.size());
    }

    @Test
    public void testSameElement(){
        Playlist playlist = new Playlist();
        Song song = new Song("Daria Zawiałow", "Pank fu", 183);
        Song sameSong = new Song("Daria Zawiałow", "Pank fu", 183);
        playlist.add(song);
        assertTrue(playlist.contains(song));
        assertEquals(playlist.getFirst(), sameSong);
    }

    @Test
    public void testEqualElement(){
        Playlist playlist = new Playlist();
        Song song = new Song("Daria Zawiałow", "Pank fu", 183);
        Song sameSong = new Song("Daria Zawiałow", "Pank fu", 183);
        playlist.add(song);
        assertEquals(playlist.getFirst(), sameSong);
        assertTrue(playlist.contains(song));
    }
}
