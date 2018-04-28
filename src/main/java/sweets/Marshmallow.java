package sweets;


import sweet.Sweet;

public class Marshmallow extends Sweet {
    private String color;

    public Marshmallow(String name, double weight, double price,String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + ", weight = " + getWeight() +
                ", price = " + getPrice() + ", colour = " + getColor();
    }
}
