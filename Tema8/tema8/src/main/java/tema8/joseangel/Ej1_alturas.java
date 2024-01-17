package tema8.joseangel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1_alturas {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Float> alturaAlumnos = new ArrayList<>();

    public static void main(String[] args) {
        for (;;)
            switch (menu()) {
                case 0: {
                    System.exit(0);
                }
                case 1: {
                    anyadirAltura();
                    break;
                }
                case 2: {
                    mostrarLista();
                    break;
                }
                case 3: {
                    if (!alturaAlumnos.isEmpty()) {
                        System.out.print("Introduce el indice a eliminar [0-" + (alturaAlumnos.size() - 1) +
                                "]:");
                        eliminaPosicion(entrada.nextInt());
                        entrada.nextLine();
                    } else
                        System.out.println("Todavía no has introducido alturas");
                }
                case 4: {
                    if (!alturaAlumnos.isEmpty()) {
                        System.out.print("Introduce la altura a eliminar [0-2.5]:");
                        eliminaValor(entrada.nextLine());
                    } else
                        System.out.println("Todavía no has introducido alturas");
                }
                case 5: {
                    Collections.sort(alturaAlumnos);
                    System.out.println("Lista ordenada ascendentemente");
                }
            }
    }

    static int menu() {
        System.out.println("____ MENU ____");
        System.out.println("1. Añadir altura");
        System.out.println("2. Mostrar lista");
        System.out.println("3. Eliminar posición");
        System.out.println("4. Eliminar valor");
        System.out.println("5. Ordenar");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.print("Introduce la opción adecuada:");
        String numeroS;
        boolean entradaok = false;
        do {
            numeroS = entrada.nextLine();
            if (numeroS.matches("^[012345]$")) {
                entradaok = true;
            } else {
                System.out.println("Opción incorrecta. Introduce una opción correcta (0-5)");
            }
        } while (!entradaok);
        return Integer.parseInt(numeroS);
    }

    /**
     * Añade una altura al ArrayList. Comprueba que el datos es correcto
     */
    static void anyadirAltura() {
        System.out.println("Introduce la altura del alumno:");
        String altura = entrada.nextLine();
        if (altura.matches("^[012]([\\.,?][0-9]+)?$")) {
            altura = altura.replace(',', '.');
            float valor = Float.parseFloat(altura);
            if (valor >= 0.5 && valor <= 2.5)
                alturaAlumnos.add(valor);
            System.out.println("Altura introducida correctamente");
        } else
            System.out.println("Error al introducir el valor");
    }

    /**
     * Muestra la lista actual con el número de posición.
     */
    static void mostrarLista() {
        System.out.println("------ Lista de datos actual");
        for (int i = 0; i < alturaAlumnos.size(); i++) {
            System.out.printf("%3d - %.2f%n", i, alturaAlumnos.get(i));
        }
    }

    /**
     * Elemina una posición de la lista alturaAlumnos
     * 
     * @param posicion.
     * @return Si ha elimiado o no esa posición
     */
    static boolean eliminaPosicion(int posicion) {
        if (posicion < alturaAlumnos.size()) {
            alturaAlumnos.remove(posicion);
            return true;
        }
        return false;
    }

    /**
     * Elimina un valor contenido en la lista alturaAlumnos.
     * Elimina todas las entradas con ese valor.
     * 
     * @param valor
     */
    static void eliminaValor(String valor) {
        if (valor.matches("^[012]([\\.,?][0-9]+)?$")) {
            valor = valor.replace(',', '.');
            Float valorF = Float.parseFloat(valor);
            int contador = 0;
            while (alturaAlumnos.remove(valorF))
                contador++;
            System.out.println("Se han eliminado " + contador + " alturas de " + valor);
        } else
            System.out.println("La altura introducida no es correcta");
    }
}
