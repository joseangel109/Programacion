package tema8.joseangel;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int array1[] = new int[10];

        String menu;
        do {
            System.out.println("a) Mostrar valores");
            System.out.println("b) Introducir valores");
            System.out.println("c) Salir");
            menu = teclado.nextLine();
            switch (menu) {
                case "a":
                    for (int aparecer : array1) {
                        System.out.println(aparecer);
                    }
                    break;
                case "b":
                    System.out.println("Dame el valor de V");
                    int v = teclado.nextInt();
                    System.out.println("Dame el valor de P (1-10)");
                    int p = teclado.nextInt();
                    array1[p-1] = v;
                    break;
                case "c":
                    System.out.println("Has elegido Salir");
                    break;
                default:
                    System.out.println("ELIGE UNA OPCION VALIDA");
                    break;
            }
        } while (!menu.equals("c"));
    }
}