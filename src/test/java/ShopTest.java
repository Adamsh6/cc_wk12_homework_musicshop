import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void setUp(){
        shop = new Shop();
        guitar = new Guitar("Blue", "Strings", "Gibson", 6, 200, 300);
    }

    @Test
    public void canAddItem(){
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItem(){
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.stockCount());
    }
}
