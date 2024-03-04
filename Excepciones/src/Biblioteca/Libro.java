package Biblioteca;
public class Libro extends Publicacion {
    private String isbn;
    private String titulo;
    private String autor;

    boolean comprobarISBN(String isbn){
        if(isbn.matches("\\d")){
            if(isbn.length()==13){
                return true;
            }
        }
        return false;
    }
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
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    void mostrarEnLinea() {
        throw new UnsupportedOperationException("Unimplemented method 'mostrarEnLinea'");
    }
}
