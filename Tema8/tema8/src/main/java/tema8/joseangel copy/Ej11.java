package tema8.joseangel;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int auxiliar=100;
        int array1[] = new int[100];
        int array2[] = new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i]=i+1;
            System.out.println(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            auxiliar-=1;
            array2[i]=array1[auxiliar];
            System.out.println(array2[i]);
        }
    teclado.close();
    }
}
