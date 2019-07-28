import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public int stockCount() {
        return stock.size();
    }

    public void removeStock(ISell item) {
        stock.remove(item);
    }
}
