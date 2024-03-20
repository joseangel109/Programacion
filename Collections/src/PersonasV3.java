import java.time.LocalDate;

public class PersonasV3 implements Comparable<PersonasV3> {
    String nombre;
    String telefono;
    String email;
    LocalDate fechaNacimiento;

    public PersonasV3(String nombre, String string, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.telefono = string;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.toLowerCase().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personas other = (Personas) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.toLowerCase().equals(other.nombre.toLowerCase()))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Personas [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento="
                + fechaNacimiento + "]";
    }

    @Override
    public int compareTo(PersonasV3 otraPersona) {
        return this.nombre.compareToIgnoreCase(otraPersona.nombre);
    }

}
