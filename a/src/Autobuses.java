public class Autobuses extends Vehiculos {

    int nAsientos;

    public Autobuses(String matricula, float fechaHoraEntrada, float fechaHoraSalida, int nAsientos) {
        super(matricula, fechaHoraEntrada, fechaHoraSalida);
        this.nAsientos = nAsientos;
    }

    @Override
    float coste() {
        float coste = super.coste() + (nAsientos * 25);
        return coste;
    }
}
