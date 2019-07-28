public abstract class Instrument {
    private String color;
    private String type;
    private String make;

    public Instrument(String color, String type, String make) {
        this.color = color;
        this.type = type;
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }
}
