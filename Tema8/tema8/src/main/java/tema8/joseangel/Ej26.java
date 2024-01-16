package tema8.joseangel;

import java.util.Iterator;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
// // Realiza un programa que tenga un ArrayList llamado AlturaAlumnos que mantenga una
// // lista con las alturas de los alumnos de un centro. Serán valores positivos entre 0,50 y 2,50
// // redondeados a dos decimales. El programa tendrá las siguientes funciones (accesibles
// // mediante un menú):
// // a) Añadir altura.
// // b) Mostrar lista actual con el número de posición.
// // c) Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura
// // en dicha posición.
// // d) Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las
// // posiciones en las que se encuentre dicha altura. Devuelve la cantidad de eliminaciones.
// // e) Ordenar la lista

// public class Ej26 {

//     public static void main(String[] args) {
//         ArrayList<Double> alturasAlumnos = new ArrayList<>();
//         char opcionMenu;
//         do {
//             opcionMenu = menu();

//         switch (opcionMenu) {
//             case 'a':
//                 añadirAltura(alturasAlumnos);
//                 break;
//             case 'b': 
//                 mostrarLista(alturasAlumnos);
//                 break;
//             case 'c':
//                 System.out.println("Eliminar por posicion introduce la posicion a borrar");
//                 int posicion=leerDato(1, alturasAlumnos.size(), "Error");
//                 eliminarPosicion(alturasAlumnos, posicion);
//                 break;
//             case 'd':
//                 System.out.println("Introduce la altura a eliminar");
//                 double altura=leerDato(0.5, 2.5, "Error");
//                 eliminarValor(alturasAlumnos, altura);
//                 break;
//             case 'e':
//                 Collections.sort(alturasAlumnos);
//                 break;
//         }
//         } while (opcionMenu !='0');
//     }

// /**
//  * Se le pasa como parametro una altura y elimina todas las posiciones en las que se encuentra dicha alutra
//  * @param alutasAlumnos
//  * @param altura
//  * @return
//  */
// private static int eliminarValor(ArrayList<Double> alutasAlumnos, double altura){
//     final double DELTA=0.0000005;
//     int contador=0;
//     Iterator<Double> iterador=alutasAlumnos.iterator();
//     while (iterador.hasNext()) {
//         double valor=iterador.next();
//         if (valor-DELTA>=altura || valor+DELTA>=altura){

//         }
//         else{
//             iterador.remove();
//             contador++;
//         }
//     }
//     return contador;
// }

//     /**
//      * 
//      * @param alutasAlumnos
//      * @param posicion
//      */
//     private static void eliminarPosicion(ArrayList<Double> alutasAlumnos, int posicion) {
//         alutasAlumnos.remove(posicion + 1);
//     }

//     /**
//      * Mostrar lista de alumnos
//      * 
//      * @param alturasListas
//      */
//     private static void mostrarLista(ArrayList<Double> alturasAlumnos) {
//         System.out.println("Listado de alutas");
//         for (int i = 0; i < alturasAlumnos.size(); i++) {
//             System.out.println((i + 1) + " - " + alturasAlumnos.get(i));
//         }
//     }

//     /**
//      * Introducimos una altura en los alumnos
//      * 
//      * @param alturasAlumnos
//      */
//     private static void añadirAltura(ArrayList<Double> alturasAlumnos) {
//         System.out.println("Introduce la altura del alumno: ");
//         double altura = leerDato(0.5, 2.5, "El numero introducido no es correcto");
//         alturasAlumnos.add(altura);

//     }

//     /**
//      * Duncion auxiliar para parametrizar la lectura de datos
//      * 
//      * @param validos cadena a comprobar con un matches
//      * @param cadena  la candea introducida
//      */
//     private static String leerDato(String validos, String cadenaIncorrecto) {
//         Scanner teclado = new Scanner(System.in);
//         boolean continuar = true;
//         String opcion = "";
//         while (continuar) {
//             System.out.println("Introduce la opcion deseada: ");
//             opcion = teclado.nextLine();
//             continuar = !opcion.matches("^[abcde0]$");
//             if (continuar)
//                 System.out.println(cadenaIncorrecto);
//         }
//         return opcion;
//     }

//     /**
//      * Funcion para leer datos reales desde teclado
//      * 
//      * @param min              numero minimo
//      * @param max              numero maximo
//      * @param cadenaIncorrecto cadena que mostrara si el datos leido no es correcto
//      * @return
//      */
//     private static double leerDato(double min, double max, String cadenaIncorrecto) {
//         Scanner teclado = new Scanner(System.in);
//         boolean continuar = true;
//         String opcion = "";
//         while (continuar) {
//             System.out.printf("Introduce un numero entre " + min + " y " + max + "):");
//             opcion = teclado.nextLine();
//             // Expresion regular que comprueba si es un numero real
//             continuar = !opcion.matches("\\d+(.[\\d]+)?$]");
//             if (continuar)
//                 System.out.println(cadenaIncorrecto);
//             else {
//                 double numero = Double.parseDouble(opcion);
//                 if (numero >= min && numero <= max)
//                     return numero;
//                 else
//                     System.out.println("Numero incorrecto");
//             }
//         }
//         return 0;
//     }

//     /**
//      * Mostrar el menu de opcione
//      * 
//      * @return devolvera un numero con la opcion correcta, 0 para salir
//      */
//     public static char menu() {
//         Scanner teclado = new Scanner(System.in);
//         System.out.println("a) Añadir altura");
//         System.out.println("b) Mostrar lista actual con numero de posicion");
//         System.out.println(
//                 "c) Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura en dicha posición.");
//         System.out.println(
//                 "d) Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las posiciones en las que se encuentre dicha altura. Devuelve la cantidad de eliminaciones.");
//         System.out.println("e) Ordenar la lista");
//         System.out.println("0) Salir");
//         String opcion = leerDato("^[abcde0]$", "Opcion incorrecta");
//         return opcion.charAt(0);
//     }
// }
public class Ej26 {

    public static void main(String[] args) {
        ArrayList<Double> alturasAlumnos = new ArrayList<>();
        char opcionMenu;

        do {
            opcionMenu = menu();

            switch (opcionMenu) {
                case 'a':
                    añadirAltura(alturasAlumnos);
                    break;
                case 'b':
                    mostrarLista(alturasAlumnos);
                    break;
                case 'c':
                    System.out.println("Eliminar por posición. Introduce la posición a borrar:");
                    int posicion = leerDato(1, alturasAlumnos.size(), "Error");
                    eliminarPosicion(alturasAlumnos, posicion - 1); // Resta 1 para ajustar a la indexación de ArrayList
                    break;
                case 'd':
                    System.out.println("Introduce la altura a eliminar:");
                    double altura = leerDato(0.5, 2.5, "Error");
                    int eliminaciones = eliminarValor(alturasAlumnos, altura);
                    System.out.println("Se han eliminado " + eliminaciones + " instancias de la altura " + altura);
                    break;
                case 'e':
                    Collections.sort(alturasAlumnos);
                    break;
            }
        } while (opcionMenu != '0');
    }

    private static int eliminarValor(ArrayList<Double> alturasAlumnos, double altura) {
        final double DELTA = 0.0000005;
        int contador = 0;
        Iterator<Double> iterador = alturasAlumnos.iterator();
        while (iterador.hasNext()) {
            double valor = iterador.next();
            if (Math.abs(valor - altura) < DELTA) {
                iterador.remove();
                contador++;
            }
        }
        return contador;
    }

    private static void eliminarPosicion(ArrayList<Double> alturasAlumnos, int posicion) {
        alturasAlumnos.remove(posicion);
    }

    private static void mostrarLista(ArrayList<Double> alturasAlumnos) {
        System.out.println("Listado de alturas:");
        for (int i = 0; i < alturasAlumnos.size(); i++) {
            System.out.println((i + 1) + " - " + alturasAlumnos.get(i));
        }
    }

    private static void añadirAltura(ArrayList<Double> alturasAlumnos) {
        System.out.println("Introduce la altura del alumno:");
        double altura = leerDato(0.5, 2.5, "El número introducido no es correcto");
        alturasAlumnos.add(altura);
    }

    // private static String leerDato(String validos, String cadenaIncorrecto) {
    // Scanner teclado = new Scanner(System.in);
    // boolean continuar = true;
    // String opcion = "";
    // while (continuar) {
    // System.out.println("Introduce la opción deseada:");
    // opcion = teclado.nextLine();
    // continuar = !opcion.matches("^[abcde0]$");
    // if (continuar)
    // System.out.println(cadenaIncorrecto);
    // }
    // return opcion;
    // }
    private static int leerDato(int min, int max, String cadenaIncorrecto) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        while (true) {
            System.out.printf("Introduce un número entre %d y %d:", min, max);

            if (teclado.hasNextInt()) {
                numero = teclado.nextInt();
                if (numero >= min && numero <= max) {
                    break;
                } else {
                    System.out.println(cadenaIncorrecto);
                }
            } else {
                teclado.next(); // Limpiar el buffer
                System.out.println(cadenaIncorrecto);
            }
        }
        return numero;
    }

    private static double leerDato(double min, double max, String cadenaIncorrecto) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        double numero = 0;

        while (continuar) {
            System.out.printf("Introduce un número entre %.2f y %.2f:", min, max);

            try {
                numero = Double.parseDouble(teclado.nextLine());
                continuar = numero < min || numero > max;
            } catch (NumberFormatException e) {
                continuar = true;
            }

            if (continuar)
                System.out.println(cadenaIncorrecto);
        }
        return numero;
    }

    public static char menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("a) Añadir altura");
        System.out.println("b) Mostrar lista actual con número de posición");
        System.out.println(
                "c) Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura en dicha posición.");
        System.out.println(
                "d) Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las posiciones en las que se encuentre dicha altura. Devuelve la cantidad de eliminaciones.");
        System.out.println("e) Ordenar la lista");
        System.out.println("0) Salir");
        String opcion = leerDato("^[abcde0]$", "Opción incorrecta");
        return opcion.charAt(0);
    }

    private static String leerDato(String string, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'leerDato'");
    }
}
