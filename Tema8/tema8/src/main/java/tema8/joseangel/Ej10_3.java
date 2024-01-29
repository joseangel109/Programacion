package tema8.joseangel;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*Implementa un programa que cree una matriz de tamaño F x C (estos valores se
introducirán como parámetros en la línea de comandos) y la rellene con números
enteros aleatorios entre 1 y 20. Luego pedirá por teclado un número V y mostrará por
pantalla cuántos valores de cada fila son múltiplos de V. Supondremos que el usuario
introducirá valores válidos por lo que no será necesario comprobarlos */
public class Ej10_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz de la fila");
        int F = teclado.nextInt();
        System.out.println("Introduce las columnas que quieres");
        int C = teclado.nextInt();
        System.out.println("Introduce un numero para buscar sus divisores");
        int V = teclado.nextInt();
        int matriz[][] = new int[F][C];
        // Le damos valor a los numeros de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ThreadLocalRandom.current().nextInt(1, 21);
            }
        }
        // Mostramos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Vemos los divisores
        for (int i = 0; i < F; i++) {
            int contador = 0;
            for (int j = 0; j < C; j++) {
                if (matriz[i][j] % V == 0) {
                    contador++;
                }
            }
            System.out.println("En la fila " + i + " hay " + contador + " múltiplos de V");
        }
    }
}