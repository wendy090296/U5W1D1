package wendydeluca.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Pizzas extends InfoProduct{
    private List<Toppings> toppings;


    public Pizzas(String name, int calories, double price) {
        super(name, calories, price);
        this.toppings = toppings;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                ", name='" + name + '\'' +
                ", topping=" + toppings +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
