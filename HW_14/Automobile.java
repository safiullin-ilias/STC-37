package HW_14;

import java.util.Objects;
import java.util.StringJoiner;


public class Automobile {
    private String Number;
    private String Model;
    private String Color;
    private int    Probeg;
    private int    Price;
    public String getNumber() {
        return Number;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        this.Price = price;
    }
    public int getProbeg() {
        return Probeg;
    }
    public void setProbeg(int probeg) {
        this.Probeg = probeg;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        this.Color = color;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        this.Model = model;
    }
    public void setNumber(String number) {
        this.Number = number;
    }

    public Automobile(String Number, String Model, String Color, int Probeg, int Price) {
        this.Number = Number;
        this.Model = Model;
        this.Color = Color ;
        this.Probeg = Probeg;
        this.Price = Price;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile auto = (Automobile) o;
        return 
            Number.toLowerCase() == auto.Number.toLowerCase() &&
            Model.toLowerCase() == auto.Model.toLowerCase() &&
            Color.toLowerCase() == auto.Color.toLowerCase() &&
            Probeg == auto.Probeg &&
            Price == auto.Price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Number, Model, Color, Probeg, Price);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Automobile.class.getSimpleName() + "[", "]")
                .add("Nomer=" + Number)
                .add("model=" + Model)
                .add("tsvet=" + Color)
                .add("probeg='" + Probeg + "'")
                .add("tsena='" + Price + "'")
                .toString();
    }
}
