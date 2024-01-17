package tema8.joseangel;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.print("dame el valor N: ");
        int N = teclado.nextInt();
        System.out.print(N + " aparece en las posiciones: ");
        for (int i = 0; i < num.length; i++) {
            if (N == num[i]) {
                System.out.print(i + ", ");
            }
        }

    }
}
