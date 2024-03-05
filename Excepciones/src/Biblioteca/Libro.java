package Biblioteca;

public class Libro extends Publicacion {
    // Creamos los atributos privados
    private String isbn;
    private String titulo;
    private Autor autor;
    private int numEjemplares;

    // SuperConstructor
    public Libro(int identificador, String isbn, Autor autor, String titulo) throws ValorIncorrecto {
        super(identificador);
        this.titulo=titulo;
        this.autor=autor;
        if(numEjemplares>0){
            this.numEjemplares=numEjemplares; 
        }else
            throw new ValorIncorrecto(numEjemplares);
    }


    // Comprobamos el ISBN que tenga 13 de longitud y sean numeros
    boolean comprobarISBN(String isbn) {
        if (this.isbn.length() == 13) {
            if (this.isbn.matches("\\d")) {
                return true;
            }
        }
        return false;
    }

    // getters y setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    @Override
    public void mostrarEnLinea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarEnLinea'");
    }
}
