package Agenda;

public class ProgramaAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Persona persona1 = new Persona("Pablo", 123457840, "10/3/34");
        Empresa empresa1 = new Empresa("aña", 9876540, "www.asagWffsfs.com");

        System.out.println(persona1);
        System.out.println("Añadimos persona1");
        agenda.añadirContacto(persona1);
        System.out.println("Mostramos la lista");
        agenda.listarContactos();
        System.out.println("Añadimos la empresa");
        agenda.añadirContacto(empresa1);
        System.out.println("Mostramos la lista");
        agenda.listarContactos();
        System.out.println("Eliminamos la empresa");
        System.out.println(agenda.eliminarContacto("aña"));
        System.out.println("Mostramos la lista");
        agenda.listarContactos();
        System.out.println("Probamos si existe el contacto aña");
        System.out.println(agenda.existeContacto("aña"));
        System.out.println("Buscamos contacto");
        System.out.println(agenda.buscaContacto("aña"));
    }
}