package Ej5;

public class Barco extends Acuaticos {
    boolean motor;

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    // Constructor
    public Barco(String matricula, String modelo, int eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Barco [motor=" + motor + super.toString() + "]";
    }

}
