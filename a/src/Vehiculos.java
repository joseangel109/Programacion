import java.util.ArrayList;

public abstract class Vehiculos {
    String matricula;
    float fechaHoraEntrada;
    float fechaHoraSalida;
    static int plazas = 100;
    static ArrayList<Vehiculos> listaParkin = new ArrayList<>();

    @Override
    public String toString() {
        return "Vehiculos [matricula=" + matricula + ", fechaHoraEntrada=" + fechaHoraEntrada + ", fechaHoraSalida="
                + fechaHoraSalida + ", plazas=" + plazas + " el tipo de vehiculo es: " + getClass().getSimpleName()
                + " y el coste es de: " + this.coste() + "]";
    }

    public Vehiculos(String matricula, float fechaHoraEntrada, float fechaHoraSalida) {
        this.matricula = matricula;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(float fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public float getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(float fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    float coste() {
        float tiempoEstancia = fechaHoraSalida - fechaHoraEntrada;
        float coste = tiempoEstancia * 4;
        return coste;
    }

    static void salida(String matricula) {
        System.out.println("Quedan: " + (plazas + 1) + " plazas");
        ArrayList<Vehiculos> copiaLista = new ArrayList<>(listaParkin);
        for (Vehiculos vehiculo : copiaLista) {
            if (vehiculo.matricula.equals(matricula)) {
                listaParkin.remove(listaParkin.indexOf(vehiculo));
            }
        }
    }

    void entrada() {
        System.out.println("Quedan: " + (plazas - 1) + " plazas");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculos other = (Vehiculos) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

}
