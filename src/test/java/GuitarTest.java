import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Blue", "Strings", "Gibson", 6, 200, 300);
    }

    @Test
    public void play() {
        assertEquals("Strums a sweet tune", guitar.play());
    }

    @Test
    public void getMarkup(){
        assertEquals(100, guitar.calculateMarkup());
    }
}