package Ej7;

public abstract class Propiedad extends Casilla implements Comprable {
    final protected int precio, hipoteca;
    private int propietario;

    public Propiedad(String nombre, int precio, int hipoteca) {
        super(nombre);
        this.precio = precio;
        this.hipoteca = hipoteca;
        this.propietario = -1;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }

    protected abstract int getAlguiler(int modificacion);

    @Override
    public String toString() {
        return "Propiedad [precio=" + precio + ", hipoteca=" + hipoteca + ", propietario=" + propietario + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + precio;
        result = prime * result + hipoteca;
        result = prime * result + propietario;
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
        Propiedad other = (Propiedad) obj;
        if (precio != other.precio)
            return false;
        if (hipoteca != other.hipoteca)
            return false;
        if (propietario != other.propietario)
            return false;
        return true;
    }

    @Override
    public void comprar(int i) {
        if (propietario == -1)
            propietario = i;
    }
}
