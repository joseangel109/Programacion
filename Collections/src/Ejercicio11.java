
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Ejercicio11 {
    public static void main(String[] args) {
        List<PersonasV3> lista = new ArrayList<>();
        lista.add(new PersonasV3("Luna", "56765432", "abcdefghijklmnñopqrstuvwyx@eso.es", LocalDate.of(2004, 10, 10)));
        lista.add(new PersonasV3("Bilma", "2222222", "z@eso.es", LocalDate.of(2014, 10, 10)));
        lista.add(new PersonasV3("Gobo", "3333333", "sdsdsdsdreterrt@eso.es", LocalDate.of(2019, 10, 10)));
        lista.add(new PersonasV3("Coco", "4444444", "poiuyt@eso.es", LocalDate.of(2016, 10, 10)));
        lista.add(new PersonasV3("Abdel", "5555555", "ñlkjhhl@eso.es", LocalDate.of(2011, 10, 1)));

        Collections.sort(lista,new Comparator<PersonasV3>() {
            @Override
            public int compare(PersonasV3 arg0, PersonasV3 arg1) {
                return arg0.email.compareTo(arg1.email);
            }
        });

        ComparadorPersonaEmail claseComparadora=new ComparadorPersonaEmail();
        Collections.sort(lista,claseComparadora);
        System.out.println("Orden de insercion");
        for (PersonasV3 personasV3 : lista) {
            System.out.println(personasV3);
        }
    }
}
