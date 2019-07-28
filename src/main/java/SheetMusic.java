public class SheetMusic implements ISell{
    private int buyPrice;
    private int sellPrice;
    private String type;

    public SheetMusic(int buyPrice, int sellPrice, String type) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.type = type;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
