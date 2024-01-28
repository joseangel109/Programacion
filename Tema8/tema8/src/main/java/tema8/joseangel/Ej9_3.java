package tema8.joseangel;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ej9_3 {
    public static void main(String[] args) {

        int tresEnRaya1 = 0;
        int tresEnRaya0 = 0;
        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ThreadLocalRandom.current().nextInt(0, 2);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Fila
        if (matriz[0][0] == 0 && matriz[0][1] == 0 && matriz[0][2] == 0)
            tresEnRaya0++;
        if (matriz[1][0] == 0 && matriz[1][1] == 0 && matriz[1][2] == 0)
            tresEnRaya0++;
        if (matriz[2][0] == 0 && matriz[2][1] == 0 && matriz[2][2] == 0)
            tresEnRaya0++;
        if (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1)
            tresEnRaya1++;
        if (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1)
            tresEnRaya1++;
        if (matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 1)
            tresEnRaya1++;
        // Columna
        if (matriz[0][0] == 0 && matriz[1][0] == 0 && matriz[2][0] == 0)
            tresEnRaya0++;
        if (matriz[0][1] == 0 && matriz[1][1] == 0 && matriz[2][1] == 0)
            tresEnRaya0++;
        if (matriz[0][2] == 0 && matriz[1][2] == 0 && matriz[2][2] == 0)
            tresEnRaya0++;
        if (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1)
            tresEnRaya1++;
        if (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1)
            tresEnRaya1++;
        if (matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1)
            tresEnRaya1++;
        // Diagonal
        if (matriz[0][0] == 0 && matriz[1][1] == 0 && matriz[2][2] == 0)
            tresEnRaya0++;
        if (matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1)
            tresEnRaya1++;
        if (matriz[0][2] == 0 && matriz[1][1] == 0 && matriz[2][0] == 0)
            tresEnRaya0++;
        if (matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 1)
            tresEnRaya1++;
        System.out.println("Han salido " + tresEnRaya0 + " tres en raya de 0");
        System.out.println("Han salido " + tresEnRaya1 + " tres en raya de 1");
    }
}