package Ej5;

public class Terrestres extends Vehiculos {
    final int numRuedas;

    // Constructor
    public Terrestres(String matricula, String modelo, int numRuedas) {
        super(matricula, modelo);
        if (matriculaValidaTerrestre(matricula)) {
        }
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    @Override
    public String toString() {
        return "Terrestres [numRuedas=" + numRuedas + super.toString() + "]";
    }

}
