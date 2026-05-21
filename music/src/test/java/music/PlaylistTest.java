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
}
