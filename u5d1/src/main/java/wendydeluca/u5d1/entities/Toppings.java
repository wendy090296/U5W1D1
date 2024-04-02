package wendydeluca.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toppings extends InfoProduct{

    public Toppings(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
