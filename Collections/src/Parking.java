import java.util.LinkedList;

public class Parking {
    public static void main(String[] args) {
        LinkedList <Coche> parking=new LinkedList();
        aparcar(parking, "1111ABC");
        aparcar(parking, "2222AVB");
        System.out.println("AÑADIDOS 2");
        mostrarLista(parking);
        System.out.println("-----------------------------");
        aparcar(parking, "2233AVB");
        System.out.println("Añadimos 1");
        mostrarLista(parking);
        System.out.println("-----------------------------");
        desaparcar(parking);
        System.out.println("-----------------------------");
        mostrarLista(parking);
    }
    static void aparcar (LinkedList parking, String matricula){
        if(parking.size()<10){
            parking.addLast(matricula);
            System.out.println("Se ha añadido el coche con la matricula: "+matricula);
        }
    }
    static String desaparcar (LinkedList parking){
        if (parking.size()>0) {
            System.out.println(parking.getLast());
            parking.removeLast();
        }
        else{
            System.out.println("El Parking esta vacio");
        }
        return null;
    }
    static void mostrarLista (LinkedList parking){
       for (Object Coche : parking) {
        System.out.println(Coche.toString());
       }
    }
}
