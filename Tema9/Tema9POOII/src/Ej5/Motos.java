package Ej5;

public class Motos extends Terrestres {
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Constructor
    public Motos(String matricula, String modelo, int numRuedas, String color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Motos [color=" + color + super.toString() + "]";
    }

}
