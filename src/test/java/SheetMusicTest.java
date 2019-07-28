import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {


    SheetMusic sheetMusic;

    @Before
    public void setUp(){
        sheetMusic = new SheetMusic(9, 12, "Sheet Music");
    }

    @Test
    public void calculateMarkup() {
        assertEquals(3, sheetMusic.calculateMarkup());
    }
}