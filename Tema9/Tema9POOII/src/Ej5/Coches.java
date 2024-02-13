package Ej5;

public class Coches extends Terrestres {
    boolean aireAcondicionado;

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    // Constructor
    public Coches(String matricula, String modelo, int numRuedas, boolean aireAcondicionado) {
        super(matricula, modelo, numRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "Coches [aireAcondicionado=" + aireAcondicionado + super.toString() + "]";
    }

}
