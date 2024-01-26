package tema8.buscaminas;

import java.util.ArrayList;
//Crear un tablero para un buscaminas
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class practica {
    public static void main(String[] args) {
        int ancho = 0;
        int alto = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el alto del tablero");
        alto = teclado.nextInt();
        System.out.println("Dime el ancho del tablero");
        ancho = teclado.nextInt();
        System.out.println("Dime el numero de minas");
        int minas = teclado.nextInt();
        practica.crearTablero(int ancho,int alto,int minas);
        practica.mostrarTablero();
    }
    public void crearTablero(int alto, int ancho, int minas){
        int matriz[][] = new int[ancho][alto];
        for (int i = 0; i == minas; i++) {
            int posicion1 = ThreadLocalRandom.current().nextInt(0, ancho);
            int posicion2 = ThreadLocalRandom.current().nextInt(0, alto);
            matriz[posicion1][posicion2] = 1;
           }
        }
    public void mostrarTablero(int alto,int ancho, int minas){
        int matriz[][] = new int[ancho][alto];
        for (int[] i : matriz) {
            for (int js : i) {
                System.out.printf("%3d", js);   
            }
            System.out.println();
           }
    }
}
