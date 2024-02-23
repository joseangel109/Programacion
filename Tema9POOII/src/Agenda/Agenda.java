// Primera parte
// Debemos implementar un programa que funcione como una agenda telefónica de contactos.

// Un contacto tiene un nombre y un teléfono (no es necesario validarlos). Se considera que dos contactos son iguales si sus nombres son iguales.
// Una agenda de contactos está formada por un conjunto de contactos y debe permitir realizar las siguientes operaciones:

// boolean añadirContacto(Contacto c): Añade un contacto a la agenda e indica si se ha añadido. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres (aunque tengan distinto teléfono).
// boolean eliminarContacto(String nombre): elimina el contacto de la agenda. Indica si se ha podido eliminar.
// boolean existeContacto(String nombre): Indica si el contacto indicado existe.
// void listarContactos(): Muestra por pantalla toda la agenda.
// int buscaContacto(String nombre): busca un contacto por su nombre y devuelve su posición en la agenda
// Implementa las clases Contacto y Agenda. Implementa también la clase ProgramaAgenda con una función main para realizar pruebas.

// Segunda parte
// Queremos modificar la agenda de contactos para poder almacenar personas y empresas. Las personas tienen nombre, teléfono y cumpleaños; 
//las empresas tienen nombre, teléfono y página web. Tendrás que modificar la clase Contacto para que sea abstracta (y tal vez otros cambios). 
//Implementa las clases ContactoPersona y ContactoEmpresa, que heredarán de Contacto. Agenda deberá seguir conteniendo una sola lista de contactos. 
//Modifica ProgramaAgenda para realizar pruebas con la nueva agenda.

package Agenda;

import java.util.ArrayList;    

public class Agenda {
    // Una agenda de contactos está formada por un conjunto de contactos y debe
    // permitir realizar las siguientes operaciones:
    ArrayList<Contacto> listaContactos = new ArrayList<>();

    boolean añadirContacto(Contacto c) {// Añade un contacto a la agenda e indica si se ha añadido.
        // No se pueden meter contactos que existan, es decir, no podemos duplicar
        // nombres (aunque tengan distinto teléfono).
        listaContactos.add(new Persona("test", 876540, "104/23/23"));
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals("test")) {
                listaContactos.remove(listaContactos.indexOf(contacto));
            }
            if (!contacto.equals(c)) {
                listaContactos.add(c);
                return true;
            }
        }
        return false;
    }

    boolean eliminarContacto(String nombre) {// elimina el contacto de la agenda. Indica si se ha podido eliminar.
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals(nombre)) {
                listaContactos.remove(listaContactos.indexOf(contacto));
                return true;
            }
        }
        return false;
    }

    boolean existeContacto(String nombre) {// Indica si el contacto indicado existe.
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    void listarContactos() {// Muestra por pantalla toda la agenda.
        for (Contacto contacto : listaContactos) {
            System.out.println(contacto);
        }
    }

    int buscaContacto(String nombre) {// busca un contacto por su nombre y devuelve su posición en la agenda
        int contador = 1;
        for (Contacto contacto : listaContactos) {
            contador++;
            if (contacto.getNombre().equals(nombre)) {
                return contador;
            }
        }
        return -1;
    }
}
