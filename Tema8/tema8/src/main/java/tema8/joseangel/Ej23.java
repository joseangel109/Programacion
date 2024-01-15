package tema8.joseangel;

import java.util.Scanner;

// Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
// teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
// deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
// que cero, cuántos son menores que cero y cuántos son igual a cero
public class Ej23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorNegativos = 0;
        int contadorCeros = 0;
        int contadorPositivos = 0;
        System.out.println("Dame el valor de N");
        int nAncho = teclado.nextInt();
        System.out.println("Dame el valor de M");
        int mAlto = teclado.nextInt();
        int matriz[][] = new int[nAncho][mAlto];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Dame un valor");
                matriz[i][j] = teclado.nextInt();
                if (matriz[i][j] < 0) {
                    contadorNegativos++;
                }
                if (matriz[i][j] == 0) {
                    contadorCeros++;
                }
                if (matriz[i][j] > 0) {
                    contadorPositivos++;
                }
            }
        }
        System.out.println("Se han introducido " + contadorCeros + " ceros, se han introducido " + contadorNegativos
                + " numeros menores a cero y se han introducido " + contadorPositivos + " numeros mayores a cero");

    }
}