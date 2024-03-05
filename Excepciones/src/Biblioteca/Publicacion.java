package Biblioteca;

public abstract class Publicacion {
    // Generamos los dos atributos que no pueden variar
    static int identificador;
    static int contador;

    // Generamos el constructor solo del id
    public Publicacion(int identificador) {
        identificador = contador++;// Hacemos que el identificador se suma de uno en uno
    }

    public abstract void mostrarEnLinea();

}
