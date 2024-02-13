package Ej5;

public class Avion extends Aereos {
    float tiempoVuelo;

    public float getTiempoVuelo() {
        return tiempoVuelo;
    }

    public void setTiempoVuelo(float tiempoVuelo) {
        this.tiempoVuelo = tiempoVuelo;
    }

    // Constructor
    public Avion(String matricula, String modelo, int numAsientos, float tiempoVuelo) {
        super(matricula, modelo, numAsientos);
        this.tiempoVuelo = tiempoVuelo;
    }

    @Override
    public String toString() {
        return "Avion [tiempoVuelo=" + tiempoVuelo + super.toString() + "]";
    }

}
