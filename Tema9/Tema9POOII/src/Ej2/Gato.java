package Ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gato extends Mascotas{
    String color;
    boolean peloLargo;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isPeloLargo() {
        return peloLargo;
    }
    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
    public Gato(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + (peloLargo ? 1231 : 1237);
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
        Gato other = (Gato) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (peloLargo != other.peloLargo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
    }

    public void muestra() {
                System.out.println(toString());

        }
}
