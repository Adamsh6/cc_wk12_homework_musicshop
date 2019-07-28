import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        guitarStrings = new GuitarStrings("Guitar Strings", 5, 10);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(5, guitarStrings.calculateMarkup());
    }

}