package wendydeluca.u5d1.entities;


import lombok.Getter;
@Getter
public abstract class InfoProduct {

    protected String name;
    protected int calories;
    protected double price;

    public InfoProduct(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }



}
