package Ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Perro extends Mascotas {
    String raza;
    boolean pulgas;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public Perro(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((raza == null) ? 0 : raza.hashCode());
        result = prime * result + (pulgas ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Perro other = (Perro) obj;
        if (raza == null) {
            if (other.raza != null)
                return false;
        } else if (!raza.equals(other.raza))
            return false;
        if (pulgas != other.pulgas)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", pulgas=" + pulgas + super.toString() + "]";
    }

    public void muestra() {
        System.out.println(toString());

    }

    public void habla() {
        System.out.println(toString());

    }
}
