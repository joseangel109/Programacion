public class Furgonetas extends Vehiculos {
    int metros;

    public Furgonetas(String matricula, float fechaHoraEntrada, float fechaHoraSalida, int metros) {
        super(matricula, fechaHoraEntrada, fechaHoraSalida);
        this.metros = metros;
    }

    @Override
    float coste() {
        float coste = super.coste() + (metros * 20);
        return coste;
    }
}
