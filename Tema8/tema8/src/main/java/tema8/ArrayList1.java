package tema8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList1 alturas = new ArrayList1();
        ArrayList<Double> alturaAlumnos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("1) Añadir Altura");
        System.out.println("2) Mostrar lista de alturas");
        System.out.println("3) Eliminar por posición");
        System.out.println("4) Ordenar la lista");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                alturas.añadirAltura(alturaAlumnos, teclado);
                break;
            case 2:
                alturas.mostrarLista(alturaAlumnos, teclado);
                break;
            case 3:
                alturas.eliminarPosicion(alturaAlumnos, teclado);
                break;
            case 4:
                Collections.sort(alturaAlumnos);
                System.out.println("La lista se ha ordenador correctamente");
                break;
            default:
                System.out.println("Introduce un valor correcto");
                break;
        }
    }

    public void añadirAltura(ArrayList<Double> alturas, Scanner teclado) {
        System.out.println("Introduce tu altura");
        double altura = teclado.nextDouble();
        if (altura > 0.50 && altura < 2.5) {
            alturas.add(altura);
        } else {
            System.out.println("Introduce un valor entre 0.50 y 2.50");
        }
    }

    public void eliminarPosicion(ArrayList<Double> alturas, Scanner teclado) {
        System.out.println("Dime una posicion que deseas borra");
        int posicion = teclado.nextInt();
        alturas.remove(posicion);
    }

    public void mostrarLista(ArrayList<Double> alturas, Scanner teclado) {
        for (int i = 0; i < alturas.size(); i++) {
            System.out.println(alturas.get(i));
        }
    }
}
