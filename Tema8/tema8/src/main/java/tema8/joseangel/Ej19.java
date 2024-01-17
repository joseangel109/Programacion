package tema8.joseangel;

import java.util.Arrays;
import java.util.Scanner;

// Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
// torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
// puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, de
// tipo entero) y luego muestre las puntuaciones en orden descendente (de la más alta a
// la más baja)
public class Ej19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int jugadores[] = new int[8];
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Dame la puntuación del " + (i + 1) + " jugador");
            jugadores[i] = teclado.nextInt();
        }
        Arrays.sort(jugadores);
        for (int i = 7; i >= 0; i += -1) {
            System.out.println(jugadores[i]);
        }
    }
}