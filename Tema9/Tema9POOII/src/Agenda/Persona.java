package Agenda;

public class Persona extends Contacto {

    // Las personas tienen nombre, teléfono y cumpleaños
    String fechaCumple;

    public Persona(String nombre, int telefono, String fechaCumple) {
        super(nombre, telefono);
        this.fechaCumple = fechaCumple;
    }

    @Override
    public String toString() {
        return "Su nombre es " + this.getNombre() + ", y su numero de telefono es: " + this.getTelefono()
                + " su fecha de nacimiento es " + fechaCumple;
    }

}
