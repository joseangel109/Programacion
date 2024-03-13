import java.util.HashMap;
import java.util.Scanner;

public class Equipo {
    public static void main(String[] args) {
        HashMap<Integer, Jugador> listaEquipo = new HashMap();
        listaEquipo.put(1, new Jugador("juan", 100));
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 10 para salir");
        int salir;
        do {
            System.out.println("Introduce 10 si quieres salir del programa, nada si quieres seguir");
            salir=teclado.nextInt();
            mostrarMenu();
            int opcion = teclado.nextInt();
             
            elegirOpcion(opcion, listaEquipo, teclado);   
             
        } while (salir==10);
        
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
                aumentarSalario(listaEquipo, teclado);
                break;
            default:
                System.out.println("Numero introducido incorrecto");
                break;
        }    
    }

    static void añadirJugador(HashMap listaEquipo, Scanner teclado) {
        System.out.println("Vas a añadir un jugador");
        
    }

    static void eliminarJugador(HashMap listaEquipo, Scanner teclado) {
        System.out.println("Dime el ID del jugador que quieres eliminar");
        int eliminarID=teclado.nextInt();
        if(listaEquipo.containsKey(eliminarID))
            listaEquipo.remove(eliminarID);
        else
            System.out.println("No se ha encontrado ningun jugador con ese ID");
    }

    static void mostrarInfoJugador(HashMap listaEquipo, Scanner teclado) {
        System.out.println("Dime el ID del jugador");
        int buscarID = teclado.nextInt();
        if(listaEquipo.containsKey(buscarID))
            listaEquipo.get(buscarID);
            System.out.println(listaEquipo.get(buscarID));
    }

    static void aumentarSalario(HashMap listaEquipo, Scanner teclado) {
        System.out.println("Dime el ID del jugador que quieres aumentar");
        int buscarID = teclado.nextInt();
        if(listaEquipo.containsKey(buscarID))
            listaEquipo.get(buscarID);
        System.out.println( );
            System.out.println(listaEquipo.get(buscarID));
    }
}
