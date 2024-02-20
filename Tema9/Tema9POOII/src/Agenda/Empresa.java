package Agenda;

public class Empresa extends Contacto {

    // las empresas tienen nombre, teléfono y página web.
    String paginaWeb;

    public Empresa(String nombre, int telefono, String paginaWeb) {
        super(nombre, telefono);
        this.paginaWeb=paginaWeb;
    }
    @Override
    public String toString() {
        return "Su nombre es " + this.getNombre() + ", y su numero de telefono es: " + this.getTelefono()+ " su pagina web es " + paginaWeb;
    }

}
