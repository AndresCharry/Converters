package model;

public abstract class Object {
    // Attributes
    private String type;

    private double value;

    // constructor
    public Object(String typeOfObjet, double ObjectValue) {
        type = typeOfObjet;
        value = ObjectValue;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }
}
