package tema8.joseangel;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir el valor N numero alturas
        System.out.print("Introduce el número de alturas (N): ");
        int N = teclado.nextInt();

        // Crear un array para almacenar las alturas
        double[] alturas = new double[N];

        // Pedir las alturas
        for (int i = 0; i < N; i++) {
            System.out.print("Introduce la altura para la persona " + (i + 1) + " (en metros): ");
            alturas[i] = teclado.nextDouble();
        }

        // Calcular la altura media
        double sumaAlturas = 0;
        for (double altura : alturas) {
            sumaAlturas += altura;
        }
        double alturaMedia = sumaAlturas / N;

        // Calcular la altura máxima y mínima
        double alturaMaxima = alturas[0];
        double alturaMinima = alturas[0];
        for (int i = 1; i < N; i++) {
            if (alturas[i] > alturaMaxima) {
                alturaMaxima = alturas[i];
            }
            if (alturas[i] < alturaMinima) {
                alturaMinima = alturas[i];
            }
        }

        // Contar cuántas personas miden por encima y por debajo de la media
        int personasPorEncima = 0;
        int personasPorDebajo = 0;
        for (double altura : alturas) {
            if (altura > alturaMedia) {
                personasPorEncima++;
            } else if (altura < alturaMedia) {
                personasPorDebajo++;
            }
        }

        // Mostrar los resultados
        System.out.println("Altura media: " + alturaMedia + " metros");
        System.out.println("Altura máxima: " + alturaMaxima + " metros");
        System.out.println("Altura mínima: " + alturaMinima + " metros");
        System.out.println("Personas por encima de la media: " + personasPorEncima);
        System.out.println("Personas por debajo de la media: " + personasPorDebajo);

    }
}
