package wendydeluca.u5d1.entities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import wendydeluca.u5d1.U5d1Application;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1Application.class);

        Pizzas pizza1 = (Pizzas) ctx.getBean("pizzaMargherita");
        Pizzas pizza2 = (Pizzas) ctx.getBean("pizzaPrimavera");
        Pizzas pizza3 = (Pizzas) ctx.getBean("pizzaDiavola");

        Drinks drink1 = (Drinks) ctx.getBean("water");
        Drinks drink2 = (Drinks) ctx.getBean("lemonade");
        Drinks drink3 = (Drinks) ctx.getBean("cocaCola");


        Toppings tp1 = (Toppings) ctx.getBean("salami");
        Toppings tp2 = (Toppings) ctx.getBean("cheese");
        Toppings tp3 = (Toppings) ctx.getBean("onions");

        Menu menu1 = new Menu (List.of(pizza1,pizza2,pizza3),List.of(drink1,drink2,drink3),List.of(tp1,tp2,tp3));

        System.out.println(menu1);

        anotherOrder(menu1);


    }

    public  void anotherOrder(Menu menu){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1Application.class);
        Order order = ctx.getBean(Order.class);
        order.setTable(ctx.getBean("getTable", Table.class));
        order.setMenu(menu);
        order.printOrder();

    }
}
