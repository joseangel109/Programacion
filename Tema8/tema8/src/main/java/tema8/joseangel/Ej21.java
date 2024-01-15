package tema8.joseangel;

import java.util.Scanner;

// Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del
// 1 al 25 y luego muestre la matriz por pantalla
public class Ej21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int numeroAux = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numeroAux;
                numeroAux++;
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}