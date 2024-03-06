package Biblioteca;

public class Libro extends Publicacion implements Comparable{
    // Creamos los atributos privados
    private String isbn;
    private String titulo;
    private Autor autor;
    private int numEjemplares;

    // SuperConstructor
    public Libro(int identificador, String isbn, Autor autor, String titulo) throws ValorIncorrecto {
        super(identificador);
        this.titulo = titulo;
        this.autor = autor;
        if (isbn.matches("^\\d{13}$"))
            this.isbn = isbn;
        else
            throw new PublicacionException("El ISBN no es correcto");
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
        System.out.printf("%4d - %6s %20s %d %n", identificador, isbn, titulo, autor, numEjemplares);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + numEjemplares;
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
        Libro other = (Libro) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        return true;
    }

    @Override
    public int compareTo(Publicacion otraCosa) {
        if (otraCosa instanceof Revista){
            return -1;
            Libro otroLibro=(Libro)otraCosa;
        }
        int comparacionTitulo = this.titulo.compareTo(otroLibro.titulo);
        if (comparacionTitulo==0)
            return this.autor.compareTo(otroLibro.autor);
        return comparacionLibro;
    }

    

}
