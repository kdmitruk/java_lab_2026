package music;

import database.DatabaseConnection;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class SongTest {
    @Test
    public void testRead() throws SQLException {
        DatabaseConnection.connect("songs.db", "");
        Optional<Song> song = Song.Persistence.read(27);
        Song equalsong = new Song("Janis Joplin", "Me and Bobby McGee", 271);
        assertEquals(equalsong, song.get());
    }
    @Test
    public void testReadFail() throws SQLException {
        DatabaseConnection.connect("songs.db", "");
        Optional<Song> song = Song.Persistence.read(171);
        assertTrue(song.isEmpty());
    }

}
