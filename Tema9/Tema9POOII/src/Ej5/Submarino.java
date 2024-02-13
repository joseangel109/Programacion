package Ej5;

public class Submarino extends Acuaticos {
    float profundidad;

    public float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }

    // Constructor
    public Submarino(String matricula, String modelo, int eslora, float profundidad) {
        super(matricula, modelo, eslora);
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "Sumarino [profundidad=" + profundidad + super.toString() + "]";
    }

}
