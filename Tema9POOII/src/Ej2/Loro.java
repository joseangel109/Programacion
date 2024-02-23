
package Ej2;

import java.time.LocalDate;

public class Loro extends Aves {
    String origen;
    boolean habla;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    public Loro(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, boolean pico, boolean vuela,
            String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((origen == null) ? 0 : origen.hashCode());
        result = prime * result + (habla ? 1231 : 1237);
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
        Loro other = (Loro) obj;
        if (origen == null) {
            if (other.origen != null)
                return false;
        } else if (!origen.equals(other.origen))
            return false;
        if (habla != other.habla)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Loro [origen=" + origen + ", habla=" + habla + super.toString() + "]";
    }

    public void saluda() {
        System.out.println(toString());

    }

    public void volar() {
        if (vuela)
            System.out.println("Tu animal puede volar");
        else
            System.out.println("Tu animal no puede volar");

    }

    public void muestra() {
        System.out.println(toString());

    }
}
