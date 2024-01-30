package tema8.buscaminas;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class practica {

    public static void main(String[] args) {
        int ancho = 0;
        int alto = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el alto del tablero");
        alto = teclado.nextInt();
        System.out.println("Dime el ancho del tablero");
        ancho = teclado.nextInt();
        System.out.println("Dime el numero de minas");
        int minas = teclado.nextInt();
        practica.crearTablero(ancho, alto, minas);
    }

    public static void crearTablero(int alto, int ancho, int minas) {
        int matriz[][] = new int[ancho][alto];
        for (int i = 0; i < minas; i++) {
            int posicion1 = ThreadLocalRandom.current().nextInt(0, ancho);
            int posicion2 = ThreadLocalRandom.current().nextInt(0, alto);
            matriz[posicion1][posicion2] = -1;
        }
        practica.mostrarTablero(matriz);
    }

    public static void mostrarTablero(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == -1) {
                    // if (matriz[i][j] != -1) matriz[i][j]++;
                    // if (matriz[i][j - 1] != -1) matriz[i][j - 1]++;
                    // if (matriz[i][j + 1] != -1) matriz[i][j + 1]++;
                    // if (matriz[i - 1][j - 1] != -1) matriz[i - 1][j - 1]++;
                    // if (matriz[i - 1][j] != -1) matriz[i - 1][j]++;
                    // if (matriz[i - 1][j + 1] != -1) matriz[i - 1][j + 1]++;
                    // if (matriz[i + 1][j - 1] != -1) matriz[i + 1][j - 1]++;
                    // if (matriz[i + 1][j] != -1) matriz[i + 1][j]++;
                    // if (matriz[i + 1][j + 1] != -1) matriz[i + 1][j + 1]++;
                    // if (matriz[i][j + 1] == -1) {
                    // matriz[i][j + 1]++;
                    // }
                    // if (matriz[i][j - 1] == -1) {
                    // matriz[i][j - 1]++;
                    // }
                    // if (matriz[i - 1][j] == -1) {
                    // matriz[i - 1][j]++;
                    // }
                    // if (matriz[i + 1][j] == -1) {
                    // matriz[i + 1][j]++;
                    // }
                    // if (matriz[i - 1][j - 1] == -1) {
                    // matriz[i - 1][j - 1]++;
                    // }
                    // if (matriz[i - 1][j + 1] == -1) {
                    // matriz[i - 1][j + 1]++;
                    // }
                    // if (matriz[i + 1][j - 1] == -1) {
                    // matriz[i + 1][j - 1]++;
                    // }
                    // if (matriz[i + 1][j - 1] == -1) {
                    // matriz[i + 1][j - 1]++;
                    // }
                    // }
                }
                for (int[] j : matriz) {
                    for (int js : j) {
                        System.out.printf("%3d", js);
                    }
                    System.out.println();
                }
            }

        }
    }
}
