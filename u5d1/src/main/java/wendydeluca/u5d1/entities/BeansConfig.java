    package wendydeluca.u5d1.entities;

    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.Random;

    @Configuration
    public class BeansConfig {

        //****************** PIZZE*********************

        @Bean
        public Pizzas pizzaMargherita(){
            return new Pizzas("Margherita",1104,10.50, Arrays.asList(tomatoSauce(), cheese()));
        }

        @Bean
        public Pizzas pizzaPrimavera(){
            return new Pizzas("Primavera",1024,14.50,Arrays.asList(tomatoSauce(),cheese(),parmaHam()));

        }

        @Bean
        public Pizzas pizzaDiavola(){
            return new Pizzas("Pepperoni",1160,12.50,Arrays.asList(tomatoSauce(),cheese(),onions(),salami()));
        }

        //**************** TOPPINGS *********************
        @Bean
        public Toppings tomatoSauce(){
            return new Toppings("Tomato sauce",15,0.25);
        }

        @Bean
        public Toppings parmaHam(){
            return new Toppings("Prosciutto di Parma",35,2.99);
        }

        @Bean
        public Toppings onions(){
            return new Toppings("Onions",22,0.69);

        }

        @Bean
        public Toppings cheese(){
            return new Toppings("Cheese",92,0.80);
        }

        @Bean
        public Toppings salami(){
            return new Toppings("Salami",86,0.99);
        }

        //****************** DRINKS ***************

        @Bean
        public Drinks water(){
            return new Drinks("Water",0,0.99,0.5,0);
        }

        @Bean
        public Drinks cocaCola(){
            return new Drinks("Coca-Cola",129,3.50,0.33,0);

        }

        @Bean
        public Drinks lemonade(){
            return new Drinks("Lemonade",148,2.99,0.33,0);

        }

        @Bean
        public Drinks wine(){
            return new Drinks("Wine",600,4.50,1,14);
        }

        @Bean
        public Menu menu(){
            List<Pizzas> pizzasList = new ArrayList<>();
            List<Drinks> drinksList = new ArrayList<>();
            List<Toppings> toppingsList = new ArrayList<>();

            pizzasList.add(pizzaMargherita());
            pizzasList.add(pizzaPrimavera());
            pizzasList.add(pizzaDiavola());
            pizzasList.forEach(System.out::println);


            drinksList.add(water());
            drinksList.add(cocaCola());
            drinksList.add(lemonade());
            drinksList.add(wine());
            drinksList.forEach(System.out::println);


            toppingsList.add(parmaHam());
            toppingsList.add(onions());
            toppingsList.add(cheese());
            toppingsList.add(salami());
            toppingsList.forEach(System.out::println);

            return new Menu(pizzasList, drinksList,toppingsList);
        }

        @Bean
        public Table getTable(){
            Random rndm = new Random();
            return new Table(rndm.nextInt(12) + 1, rndm.nextInt(10) + 2, true);
        }

    }
