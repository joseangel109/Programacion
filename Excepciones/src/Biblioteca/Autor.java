package Biblioteca;

public class Autor {
    private final String nombre;
    private final String pseudomonio;
    public Autor(String nombre, String pseudomonio) {
        this.nombre = nombre;
        this.pseudomonio = pseudomonio;
    }
    
    @Override
    public String toString() {
        return "Autor [nombre=" + nombre + ", pseudomonio=" + pseudomonio + "]";
    }
}
