package tema8.joseangel;

import java.util.Scanner;

// Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
// de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
// pantalla
public class Ej22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            System.out.println("La tabla del " + (i + 1));
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=(i+1)*(j+1);
                //System.out.print((i + 1) + " x " + (j + 1) + " = " + (i + 1) * (j + 1));
                System.out.print((i+1)+" * "+(j+1)+"="+ matriz[i][j] + " , ");
            }
        }
    }
}