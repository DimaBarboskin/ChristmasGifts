package sweets;


import sweet.Sweet;

public class Cookie extends Sweet{
    private boolean filling;

    public Cookie(String name, double weight, double price,boolean filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + ", weight = " + getWeight() +
                ", price = " + getPrice() + ", filling = " + isFilling();
    }
}
