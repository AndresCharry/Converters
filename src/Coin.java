public class Coin {
    // Attributes
    private String type;

    private double value;

    // constructor
    Coin(String typeOfCoin, double coinValue) {
        type = typeOfCoin;
        value = coinValue;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
