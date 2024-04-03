package wendydeluca.u5d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Menu {
    protected List<Pizzas> pizzasList;
    protected List<Drinks> drinksList;
    protected List<Toppings> toppingsList;

    public void printMenu() {
            System.out.println("******* Menu *******");
            System.out.println("PIZZAS");
            if (!pizzasList.isEmpty()) {
                pizzasList.forEach(System.out::println);
            } else {
                System.out.println("No pizzas available.");
            }
            System.out.println();

            System.out.println("TOPPINGS");
            if (!toppingsList.isEmpty()) {
                toppingsList.forEach(System.out::println);
            } else {
                System.out.println("No toppings available.");
            }
            System.out.println();

            System.out.println("DRINKS");
            if (!drinksList.isEmpty()) {
                drinksList.forEach(System.out::println);
            } else {
                System.out.println("No drinks available.");
            }
            System.out.println();
        }




    public double getPrice() {
        double totalPrice = 0;
        for (Pizzas pizza : pizzasList) {
            totalPrice += pizza.getPrice();
        }
        for (Drinks drink : drinksList) {
            totalPrice += drink.getPrice();
        }
        return totalPrice;
    }


}
