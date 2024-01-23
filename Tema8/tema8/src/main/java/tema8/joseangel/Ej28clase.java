package tema8.joseangel;

import java.util.ArrayList;
import java.util.Iterator;
// Supongamos una clase Producto con dos atributos: 
// • String nombre
// • int cantidad
// Implementa esta clase con un constructor (con parámetros) además de los getters y
// setters de sus dos atributos. No es necesario comprobar los datos introducidos.
// A continuación, en el programa principal haz lo siguiente:
// 1. Crea 5 instancias de la Clase Producto. 
// 2. Crea un ArrayList. 
// 3. Añade las 5 instancias de Producto al ArrayList.
// 4. Visualiza el contenido de ArrayList utilizando Iterator. 
// 5. Elimina dos elemento del ArrayList.
// 6. Inserta un nuevo objeto producto en medio de la lista.
// 7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator. 
// 8. Elimina todos los valores del ArrayList./

public class Ej28clase {
    public static void main(String[] args) {
        // Instanciamos los 5 productos
        System.out.println("Los productos iniciales son:");
        Productos p1 = new Productos("lila", 8);
        Productos p2 = new Productos("azul", 7);
        Productos p3 = new Productos("rojo", 2);
        Productos p4 = new Productos("amarillo", 3);
        Productos p5 = new Productos("verde", 1);

        // Creamos el arraylist
        ArrayList productos = new ArrayList<>();

        // añadimos los productos a la lista
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        // Visualizamos la lista con iterator
        Iterator<Productos> iter = productos.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Hasta aqui tenemos los 5 productos principales:");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Ahora eliminamos el Lila y el Azul y añadimos negro");
        // Eliminamos dos productos
        productos.remove(p1);
        productos.remove(p2);

        // Añadimos 1 producto en la 3 linea
        productos.add(1, new Productos("negro", 12));

        // Visualizamos la lista con iterator
        Iterator<Productos> iter2 = productos.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        System.out.println("----------------------------------------------------------------------------");
        // Eliminamos los productos de la lista
        productos.clear();
    }

}