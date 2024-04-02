package wendydeluca.u5d1.entities;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Drinks extends InfoProduct{
    private double litre;
    private int alcoolPercentage;
    public Drinks(String name, int calories, double price, double litre, int alcoolPercentage) {
        super(name, calories, price);
        this.litre = litre;
        this.alcoolPercentage = alcoolPercentage;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + getName() + '\'' +
                ", calories=" + getCalories() +
                ", price=" + getPrice() +
                ", litre=" + getLitre() + "l" + ", alcool=" + getAlcoolPercentage() + "%" +
                '}';
    }
}
