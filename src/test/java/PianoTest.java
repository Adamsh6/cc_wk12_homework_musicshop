import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Blue", "Strings", "Gibson", "Grand", 500, 800);
    }

    @Test
    public void play() {
        assertEquals("Tinkles the ivories", piano.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(300, piano.calculateMarkup());
    }
}