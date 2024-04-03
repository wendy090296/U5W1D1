package wendydeluca.u5d1.entities;



import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Random;
@Component
@Getter
@Setter
@PropertySource("application.properties")
public class Order {
    private Table table;
    private Menu menu;
    private int orderNumber;
    private OrderStatus orderStatus = OrderStatus.IN_PROGRESS;
    private int seats;
    private LocalTime orderTime = LocalTime.now();
    @Value("${order.seat}")
    private double priceSeat;

    public Order(){
        orderNumber++; // il numero di ordine si incrementa ad ogni comanda
    }

    public void setTable(Table table){
        Random rdm = new Random();
        table.setAvailable(false);
        this.table = table;
         seats = rdm.nextInt(table.getSeats()) + 1;

    }

    public double getTotalAmount(){
        return (menu.getPrice() + seats) * priceSeat;
    }

    public void printOrder(){
        System.out.println("Order number: " + orderNumber);
        System.out.println("Table number: " + table.getTableNumber());
        System.out.println("Seats: " + seats + " / " + table.getSeats());
        System.out.println("Order time: " + orderTime);
        System.out.println("Order state: " + orderStatus);
        System.out.println("Seats price: " + priceSeat);
        System.out.println();
        System.out.println("Detail order");
        menu.getPizzasList().forEach(System.out::println);
        menu.getDrinksList().forEach(System.out::println);
        System.out.println("Order price: " + getPriceSeat());
        System.out.println();
    }

}
