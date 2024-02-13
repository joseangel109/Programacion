package Ej5;

public class Aereos extends Vehiculos {
    final int numAsientos;

    // Constructor
    public Aereos(String matricula, String modelo, int numAsientos) {
        super(matricula, modelo);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    @Override
    public String toString() {
        return "Aereos [numAsientos=" + numAsientos + super.toString() + "]";
    }

}
