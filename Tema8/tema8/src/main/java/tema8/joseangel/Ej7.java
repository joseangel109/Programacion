package tema8.joseangel;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int p;
        int q;
        do {
            System.out.println("Dame el valor de P");
        p=teclado.nextInt();
        System.out.println("Dame el valor de Q");
        q=teclado.nextInt();
        } while (p<q);
        
    }
}
