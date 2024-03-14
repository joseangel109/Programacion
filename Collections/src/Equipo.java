import java.util.HashMap;
import java.util.Scanner;

public class Equipo {
    public static void main(String[] args) {
        HashMap<Integer, Jugador> listaEquipo = new HashMap();
        listaEquipo.put(1, new Jugador("Juan", 100));
        listaEquipo.put(12, new Jugador("Pedro", 1240));
        Scanner teclado = new Scanner(System.in);
        mostrarMenu();
        int opcion = teclado.nextInt();

        elegirOpcion(opcion, listaEquipo, teclado);

    }

    static void mostrarMenu() {
        System.out.println("Elige que quieres hacer");
        System.out.println("Añadir jugador (1)");
        System.out.println("Eliminar jugador (2)");
        System.out.println("Consultar Salario (3)");
        System.out.println("Aumentar Salario un 10% (4)");
        System.out.println("Introduce 10 para salir");
    }

    static void elegirOpcion(int opcion, HashMap listaEquipo, Scanner teclado) {

        switch (opcion) {
            case 1:
                System.out.println("Has elegido añadir jugador");
                añadirJugador(listaEquipo, teclado);
                break;
            case 2:
                System.out.println("Has elegido eliminar jugador");
                eliminarJugador(listaEquipo, teclado);
                break;
            case 3:
                System.out.println("Has elegido consultar salario");
                mostrarInfoJugador(listaEquipo, teclado);
                break;
            case 4:
                System.out.println("Has elegido aumentar salario un 10%");
                aumentarSalario(listaEquipo, teclado, Jugador.getSalario(), Jugador.getNombre());
                break;
            default:
                System.out.println("Numero introducido incorrecto");
                break;
        }
    }

    static String añadirJugador(HashMap listaEquipo, Scanner teclado) {
        System.out.println(listaEquipo);
        System.out.println("Vas a añadir un jugador");
        System.out.println("Dime el nombre del jugador");
        String x = teclado.nextLine();
        String nombre = teclado.nextLine();
        System.out.println("Dime el ID del jugador");
        int id = teclado.nextInt();
        System.out.println("Dime el salario del jugador " + nombre);
        double salario = teclado.nextDouble();
        listaEquipo.put(id, new Jugador(nombre, salario));
        System.out.println("Se ha añadido el jugador");
        System.out.println(listaEquipo);
        return listaEquipo.toString();
    }

    static void eliminarJugador(HashMap listaEquipo, Scanner teclado) {
        System.out.println("Dime el ID del jugador que quieres eliminar");
        int eliminarID = teclado.nextInt();
        if (listaEquipo.containsKey(eliminarID)) {
            listaEquipo.remove(eliminarID);
        } else
            System.out.println("No se ha encontrado ningun jugador con ese ID");
        System.out.println(listaEquipo);
    }

    static void mostrarInfoJugador(HashMap listaEquipo, Scanner teclado) {
        System.out.println(listaEquipo.toString());
        System.out.println("Dime el ID del jugador");
        int buscarID = teclado.nextInt();
        if (listaEquipo.containsKey(buscarID))
            listaEquipo.get(buscarID);
        System.out.println(listaEquipo.get(buscarID));
    }

    static void aumentarSalario(HashMap listaEquipo, Scanner teclado, double salario, String nombre) {
        System.out.println(listaEquipo.toString());
        System.out.println("Dime el ID del jugador que quieres aumentar");
        int buscarID = teclado.nextInt();
        if (listaEquipo.containsKey(buscarID)) {
            System.out.println("El nuevo salario es:");
            double nuevoSalario = salario + ((salario * 10) / 100);
            listaEquipo.put(buscarID, new Jugador(Jugador.getNombre(), nuevoSalario));
        }
        System.out.println(listaEquipo);

    }
}
