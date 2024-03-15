import java.util.HashMap;
import java.util.Scanner;

public class EquipoV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<Integer, JugadorV2> plantilla = new HashMap();
        plantilla.put(1, new JugadorV2("Juan", 100));
        plantilla.put(2, new JugadorV2("Pedro", 1240));
        mostrarMenu();
        int opcion = teclado.nextInt();
        elegirOpcion(opcion, plantilla, teclado);
    }

    static void mostrarMenu() {
        System.out.println("Elige que quieres hacer");
        System.out.println("Añadir jugador (1)");
        System.out.println("Eliminar jugador (2)");
        System.out.println("Mostrar plantilla (3)");
    }

    static void elegirOpcion(int opcion, HashMap plantilla, Scanner teclado) {

        switch (opcion) {
            case 1:
                System.out.println("Has elegido añadir jugador");
                añadirJugador(plantilla, teclado);
                break;
            case 2:
                System.out.println("Has elegido eliminar jugador");
                eliminarJugador(plantilla, teclado);
                break;
            case 3:
                System.out.println("Has elegido mostrar plantilla");
                mostrarInfoJugador(plantilla, teclado);
                break;
            default:
                System.out.println("Numero introducido incorrecto");
        }
    }

    static String añadirJugador(HashMap plantilla, Scanner teclado) {
        System.out.println(plantilla);
        System.out.println("Vas a añadir un jugador");
        System.out.println("Dime el nombre del jugador");
        String x = teclado.nextLine();
        String nombre = teclado.nextLine();
        System.out.println("Dime el ID del jugador");
        int id = teclado.nextInt();
        System.out.println("Dime el salario del jugador " + nombre);
        double salario = teclado.nextDouble();
        plantilla.put(id, new Jugador(nombre, salario));
        System.out.println("Se ha añadido el jugador");
        System.out.println(plantilla);
        return plantilla.toString();
    }

    static void eliminarJugador(HashMap plantilla, Scanner teclado) {
        System.out.println("Dime el ID del jugador que quieres eliminar");
        int eliminarID = teclado.nextInt();
        if (plantilla.containsKey(eliminarID)) {
            plantilla.remove(eliminarID);
        } else
            System.out.println("No se ha encontrado ningun jugador con ese ID");
        System.out.println(plantilla);
    }

    static void mostrarInfoJugador(HashMap plantilla, Scanner teclado) {
        for (int i = 0; i < plantilla.size()+1; i++) {
            if(plantilla.get(i) != null){
                System.out.println(plantilla.get(i));
            }
            else{
                System.out.println("El jugador con el dorsal "+i+" esta libre");
            }
        }
        System.out.println("Quieres comprobar salarios parecidos?");
        System.out.println("Si es que si (1), si que no (2)");
        int opcion=teclado.nextInt();
        if(opcion==1){
            System.out.println("Dime un salario");
            double salario=teclado.nextDouble();
            
        }
            else{
                System.out.println("Adios");
            }
    }
}
