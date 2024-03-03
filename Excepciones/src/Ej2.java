import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {
    // Implementa un programa que pida dos valores int A y B utilizando un nextInt()
    // (de
    // Scanner), calcule A/B y muestre el resultado por pantalla. Se deberán tratar
    // de
    // forma independiente las dos posibles excepciones, InputMismatchException y
    // ArithmeticException, mostrando en cada caso un mensaje de error diferente.
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Dime el numero n1");
            int n1 = teclado.nextInt();
            System.out.println("Dime el numero n2");
            int n2 = teclado.nextInt();

            if (n2 == 0) {
                System.out.println("Error: No se puede dividir por cero.");
            } else {
                // Realizar la división si B no es cero
                double resultado = (double) n1 / n2;
                System.out.println("Resultado de la división: " + resultado);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Introduce un numero entero positivo");

        } catch (ArithmeticException e) {
            System.out.println("Error: Se ha producido una excepción aritmética.");

        }
    }
}
