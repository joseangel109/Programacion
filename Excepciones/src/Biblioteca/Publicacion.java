package Biblioteca;

public abstract class Publicacion implements Comparable<Publicacion> {
    // Generamos los dos atributos que no pueden variar
    static int identificador;
    static int contador;

    // Generamos el constructor solo del id
    public Publicacion(int identificador) {
        identificador = contador++;// Hacemos que el identificador se suma de uno en uno
    }

    public abstract void mostrarEnLinea();

    @Override
    public int compareTo(Publicacion arg0) {
        if (this instanceof Libro && arg0 instanceof Revista)
            return -1;
        else if (this instanceof Revista && arg0 instanceof Libro)
            return 1;
        return 0;
    }
}
