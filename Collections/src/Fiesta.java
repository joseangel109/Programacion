import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;

public class Fiesta {
    public static void main(String[] args) {
        HashSet <Personas> fiesta = new HashSet<>();
        int mediaEdad=0;
        int mayor=0;
        fiesta.add(new Personas("saksa", 33444555, "janu..", LocalDate.of(2002, Month.JUNE, 3)));
        fiesta.add(new Personas("Juan", 111222333, "juan..", LocalDate.of(1972, 3, 23)));
        fiesta.add(new Personas("Pablo", 99965656, "ash..", LocalDate.of(1999, Month.DECEMBER, 20)));
        fiesta.add(new Personas("Jose", 123456789, "jsss..", LocalDate.of(1992, Month.JANUARY, 23)));
        fiesta.add(new Personas("Miguel", 111222333, "amg..", LocalDate.of(2022, Month.NOVEMBER, 23)));
    //Si creamos dos personas con el mismo nombre se queda el primero el otro no se guarda
        for (Personas personas : fiesta) {
            System.out.println(personas.toString());
            System.out.println((Math.abs(personas.fechaNacimiento.getYear() - 2024)));
            mediaEdad+=(Math.abs(personas.fechaNacimiento.getYear() - 2024));
            for (int i = 0; i < fiesta.size(); i++) {
                if((Math.abs(personas.fechaNacimiento.getYear() - 2024))>mayor){
                    mayor=(Math.abs(personas.fechaNacimiento.getYear() - 2024));
                }
            }
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("La media de edad es de: "+mediaEdad/fiesta.size()); 
        System.out.println("------------------------------------------");
        System.out.println("El mayor es: "+mayor);
    }
//El orden que tiene es en el que se han añadido

}
