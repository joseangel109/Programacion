package Biblioteca;

public class Revista extends Publicacion {
    private String issn;
    private String nombre;
    private int numero;
    private static int contador = 1;

    // Constructor y comprobacion del issn
    public Revista(String issn, String nombre, int numero) throws Exception {
        super(contador);
        if (issn.equals("^\\d{8}"))
            this.issn = issn;
        else
            throw new PublicacionException("El codigo ISSN no es correcto");
        this.nombre = nombre;
        this.numero = numero;
    }

    // generamos una excepcion por si algun dato falla en el constructor
    class PublicacionException extends Exception {
        public PublicacionException() {
            super("Excepcion de tipo");
        }
    }

    // Getters y setters
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Revista.contador = contador;
    }

    // Aun no
    @Override
    public void mostrarEnLinea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarEnLinea'");
    }

}
