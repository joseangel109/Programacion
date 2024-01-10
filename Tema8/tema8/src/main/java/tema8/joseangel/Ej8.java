package tema8.joseangel;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num[] = new float[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = (float) ((Math.random() * 1) + 0);
            System.out.println(num[i]);
        }
        System.out.println("Valor de N");
        float n = teclado.nextFloat();
        int cont = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= n) {
                cont += 1;
            }
        }
        System.out.println("Aparecen " + cont + " numeros mayores o iguales");
    }
}
