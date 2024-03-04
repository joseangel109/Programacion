import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
    // Implementa un programa que cree un vector tipo double de tamaño 5 y luego,
    // utilizando un bucle, pida cinco valores por teclado y los introduzca en el
    // vector.
    // Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores
    // hasta
    // rellenar completamente el vector
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double[] vector = new double[5];
        int contador = 5;

        for (int i = 0; i < contador; i++) {
            try {
                System.out.print("Ingrese un valor para la posición " + i + ": ");
                double valor = teclado.nextDouble();
                vector[i] = valor;

            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce un numero.");
                teclado.nextLine();
            }
        }

    }
}
