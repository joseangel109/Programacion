import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {
    // Implementa un programa que pida dos valores int A y B utilizando un nextInt()
    // (de
    // Scanner), calcule A/B y muestre el resultado por pantalla. Se deberán tratar
    // de
    // forma independiente las dos posibles excepciones, InputMismatchException y
    // ArithmeticException, mostrando en cada caso un mensaje de error diferente.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el numero n1");
        int n1 = teclado.nextInt();
        System.out.println("Dime el numero n2");
        int n2 = teclado.nextInt();
        System.out.println("El resultado es: " + n1 / n2);
    }
}
