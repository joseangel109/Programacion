package Ej5;

public class Acuaticos extends Vehiculos {
    final int eslora;

    // Constructor
    public Acuaticos(String matricula, String modelo, int eslora) {
        super(matricula, modelo);
        this.eslora = eslora;
    }

    public int getEslora() {
        return eslora;
    }

    @Override
    public String toString() {
        return "Acuaticos [eslora=" + eslora + super.toString() + "]";
    }

}
