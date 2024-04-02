package wendydeluca.u5d1.entities;

import java.util.List;

public class Menu {
    private List<Pizzas> pizzasList;
    private List<Drinks> drinksList;
    private List<Toppings> toppingsList;

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
//        pizzasList.forEach(System.out::println);
        System.out.println(pizzasList);
        System.out.println();

        System.out.println("TOPPINGS");
//        toppingsList.forEach(System.out::println);
        System.out.println(toppingsList);
        System.out.println();

        System.out.println("DRINKS");
//        drinksList.forEach(System.out::println);
        System.out.println(drinksList);
        System.out.println();

    }
}
