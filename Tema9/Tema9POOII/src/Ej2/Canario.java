package Ej2;

import java.time.LocalDate;

public class Canario extends Aves {
    String color;
    boolean canta;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    public Canario(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, boolean pico, boolean vuela,
            String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + (canta ? 1231 : 1237);
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
        Canario other = (Canario) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (canta != other.canta)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Canario [color=" + color + ", canta=" + canta + super.toString() + "]";
    }

    public void habla() {
        System.out.println("PIO PIO");

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
