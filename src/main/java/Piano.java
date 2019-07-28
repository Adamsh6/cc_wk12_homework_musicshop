public class Piano extends Instrument implements IPlay, ISell{
    private String pianoType;
    private int buyPrice;
    private int sellPrice;

    public Piano(String color, String type, String make, String pianoType, int buyPrice, int sellPrice) {
        super(color, type, make);
        this.pianoType = pianoType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getPianoType() {
        return pianoType;
    }

    public String play() {
        return "Tinkles the ivories";
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
