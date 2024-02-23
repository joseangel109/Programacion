package Ej7;

public class Terreno extends Propiedad {

    public enum Color {
        ROJO, AMARILLO, VERDE
    };

    private int precioAlquiler;
    private Color color;

    public Terreno(String nombre, int precio, int hipoteca, int precioAlquiler, Color color) {
        super(nombre, precio, hipoteca);
        this.precioAlquiler = precioAlquiler;
        this.color = color;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    protected int getAlguiler(int modificacion) {
        if (modificacion > 4)
            modificacion = 10;
        return this.precioAlquiler * modificacion;
    }

    @Override
    public String toString() {
        return super.toString() + "precioAlquiler=" + precioAlquiler + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + precioAlquiler;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
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
        Terreno other = (Terreno) obj;
        if (precioAlquiler != other.precioAlquiler)
            return false;
        if (color != other.color)
            return false;
        return true;
    }

}