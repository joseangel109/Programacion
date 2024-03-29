package tema8.joseangel;

public class Productos {
    private String nombre;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Productos(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Productos [nombre=" + nombre + ", cantidad=" + cantidad + "]";
    }

}