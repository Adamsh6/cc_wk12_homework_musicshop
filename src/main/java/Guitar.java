public class Guitar extends Instrument implements IPlay, ISell{
    private int noOfStrings;
    private int buyPrice;
    private int sellPrice;


    public Guitar(String color, String type, String make, int noOfStrings, int buyPrice, int sellPrice) {
        super(color, type, make);
        this.noOfStrings = noOfStrings;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String play() {
        return "Strums a sweet tune";
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
