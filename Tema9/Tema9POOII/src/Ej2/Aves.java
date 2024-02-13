package Ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Aves extends Mascotas {
    boolean pico;
    boolean vuela;

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public Aves(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, boolean pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (pico ? 1231 : 1237);
        result = prime * result + (vuela ? 1231 : 1237);
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
        Aves other = (Aves) obj;
        if (pico != other.pico)
            return false;
        if (vuela != other.vuela)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return " [pico=" + pico + ", vuela=" + vuela + super.toString() + "]";
    }

    public void muestra() {
        System.out.println(toString());

    }

    public void volar() {
        if (vuela)
            System.out.println("Tu animal puede volar");
        else
            System.out.println("Tu animal no puede volar");

    }
}
