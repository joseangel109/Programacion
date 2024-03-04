package Ej7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej7Main {
    public static void main(String[] args) {
        ArrayList<Ej7_1> listaGatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int gatosCreados = 0;

        while (gatosCreados < 5) {
            try {
                System.out.println("Introduce los datos del gato #" + (gatosCreados + 1) + ":");
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Edad: ");
                int edad = Integer.parseInt(scanner.nextLine());

                Ej7_1 nuevoGato = new Ej7_1(nombre, edad);
                listaGatos.add(nuevoGato);

                System.out.println("Gato creado y almacenado correctamente.");
                gatosCreados++;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Inténtalo de nuevo.");
            }
        }

        System.out.println("\nInformación de los gatos:");
        for (Ej7_1 gato : listaGatos) {
            gato.imprimir();
            System.out.println();
        }
    }
}
