package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    private static ArrayList<Mascotas> listaAnimales = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Perro perro1 = new Perro(null, 0, false, null, null, false);
        Gato gato1 = new Gato(null, 0, false, null, null, false);
        Loro loro1 = new Loro(null, 0, false, null, false, false, null, false);
        Canario canario1 = new Canario(null, 0, false, null, false, false, null, false);
        listaAnimales.add(perro1);
        listaAnimales.add(gato1);
        listaAnimales.add(loro1);
        listaAnimales.add(canario1);
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    mostrarAnimales();
                    break;
                case 2:
                    mostrarAnimalID(teclado);
                    break;
                case 3:
                    mostrarTodo();
                    break;
                case 4:

                    break;
                case 5:
                    eliminarAnimal(teclado);
                    break;
                case 6:
                    vaciarInventario();
                    break;
                case 7:
                    System.out.println("Hasta pronto");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 7);

    }

    public static void mostrarMenu() {
        System.out.println("Que quieres hacer?");
        System.out.println("1) Muestras los animales tipo y nombre");
        System.out.println("2) Muestras todos los datos de un animal en concreto");
        System.out.println("3) Muestras todos los datos de todos los animales");
        System.out.println("4) Insertar animales");
        System.out.println("5) Eliminar animales");
        System.out.println("6) Vaciar inventario");
        System.out.println("7) Salir");
    }

    public static void mostrarAnimales() {
        for (Mascotas bicho : listaAnimales) {
            System.out
                    .println("Nombre de la mascota " + bicho.getNombre() + " tipo " + bicho.getClass().getSimpleName());
        }
    }

    public static void mostrarAnimalID(Scanner teclado) {
        System.out.println("Que animal quieres mostrar");
        int ID = teclado.nextInt();
        System.out.println(listaAnimales.get(ID - 1));
    }

    public static void mostrarTodo() {
        System.out.println(listaAnimales);
    }

    public static void nuevoAnimal() {

    }

    public static void eliminarAnimal(Scanner teclado) {
        System.out.println("Que animal quieres eliminar");
        int ID = teclado.nextInt();
        listaAnimales.remove(ID);
    }

    public static void vaciarInventario() {
        listaAnimales.clear();
    }
}
