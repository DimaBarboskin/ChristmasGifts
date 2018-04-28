package sweets;


import sweet.Sweet;

public class Jellybean extends Sweet {
    private String flavour;

    public Jellybean(String name, double weight, double price,String flavour) {
        super(name, weight, price);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + ", weight = " + getWeight() +
                ", price = " + getPrice() + ", flavour = " + getFlavour();
    }
}
