import java.util.Comparator;

public class ComparadorPersonaEmail implements Comparator<PersonasV3>{
    public static void main(String[] args) {
        
    }

    @Override
    public int compare(PersonasV3 persona1, PersonasV3 persona2) {
        return persona1.email.compareTo(persona2.email);
    }
}
