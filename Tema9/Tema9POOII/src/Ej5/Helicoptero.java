package Ej5;

public class Helicoptero extends Aereos {
    int numElices;

    public int getNumElices() {
        return numElices;
    }

    public void setNumElices(int numElices) {
        this.numElices = numElices;
    }

    // Constructor
    public Helicoptero(String matricula, String modelo, int numAsientos, int numElices) {
        super(matricula, modelo, numAsientos);
        this.numElices = numElices;
    }

    @Override
    public String toString() {
        return "Helicoptero [numElices=" + numElices + super.toString() + "]";
    }

}
