package wendydeluca.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wendydeluca.u5d1.entities.Menu;
import wendydeluca.u5d1.entities.Pizzas;
import wendydeluca.u5d1.entities.Toppings;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1Application.class);
		// riferimento allo "SCATOLONE"

		Menu menu = (Menu) ctx.getBean("menu");
		menu.printMenu();
		ctx.close();




	}

}
