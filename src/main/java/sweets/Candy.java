package sweets;


import sweet.Sweet;

public class Candy extends Sweet{
    private String shape;

    public Candy(String name, double weight, double price,String shape) {
        super(name, weight, price);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + ", weight = " + getWeight() +
                ", price = " + getPrice() + ", shape = " + getShape();
    }
}
