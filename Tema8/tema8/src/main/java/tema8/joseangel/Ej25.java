package tema8.joseangel;

import java.util.Scanner;
// Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
// empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por
// teclado la información de N personas distintas (valor también introducido por teclado).
// Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
// información debe guardarse en una única matriz. Luego se mostrará por pantalla el
// sueldo medio de cada género

public class Ej25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = teclado.nextInt();
        double[][] matriz = new double[n][2];
        int genero;
        int contMujeres = 0;
        int contHombres = 0;
        double mediaMujeres = 0;
        double mediaHombres = 0;
        for (int i = 0; i < matriz.length; i++) {
            do {
                System.out.println("0 si es hombre");
                System.out.println("1 si es mujer");
                genero = teclado.nextInt();
            } while (genero != 1 && genero != 0);
            switch (genero) {
                case 0:
                    System.out.println("Eres hombre. Cual es tu salario?");
                    matriz[i][0] = teclado.nextDouble();
                    contHombres++;
                    mediaHombres = mediaHombres + matriz[i][0];
                    break;
                case 1:
                    System.out.println("Eres hombre. Cual es tu salario?");
                    matriz[i][1] = teclado.nextDouble();
                    contMujeres++;
                    mediaMujeres = mediaMujeres + matriz[i][1];
                    break;
            }
        }
        mediaHombres = mediaHombres / contHombres;
        mediaMujeres = mediaMujeres / contMujeres;
        System.out.println("El suelo medio de los hombres es: " + mediaHombres);
        System.out.println("El suelo medio de las mujeres es: " + mediaMujeres);
    }
}
