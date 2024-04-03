package wendydeluca.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Table {
    private int tableNumber;
    private int seats;
    private boolean isAvailable;

    public Table(int tableNumber, int seats, boolean available){
        this.tableNumber= tableNumber;
        this.seats = seats;
        this.isAvailable = true;

    }

    public void setAvailable(boolean available){
        isAvailable = available;
    }


}
