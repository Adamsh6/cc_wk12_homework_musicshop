public class GuitarStrings implements ISell{
    private String type;
    private int buyPrice;
    private int sellPrice;

    public GuitarStrings(String type, int buyPrice, int sellPrice) {
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
