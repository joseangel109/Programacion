package Ej7;

public class Casilla {

    private static int contadorCasillas = 1;

    private final String nombre;
    private final int codigo;

    public Casilla(String nombre) {
        this.nombre = nombre;
        this.codigo = contadorCasillas++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Nombre= (" + getClass().getSimpleName() + ")" + nombre + ", codigo=" + codigo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + codigo;
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
        Casilla other = (Casilla) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (codigo != other.codigo)
            return false;
        return true;
    }

}
