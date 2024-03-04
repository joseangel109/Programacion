import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) throws Exception {
        Scanner teclado= new Scanner(System.in);
        try {
            System.out.println("Dime un numero P");
            int p=teclado.nextInt();
            imprimePositivo(p);
            System.out.println("Dime un numero N");
            int n=teclado.nextInt();
            imprimeNegativo(n);
        } catch (InputMismatchException e) {
            System.out.println("Error: Introduce un numero entero");
        }
}

    static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("ERROR: Numero introducido negativo");
        }
    }

    static void imprimeNegativo(int n) throws Exception {
        if (n > 0) {
            throw new Exception("ERROR: Numero introducido positivo");
        }
    }
}
