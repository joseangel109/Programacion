package tema8.joseangel;

public class Ej4LineaFactura {
    private String descripcion;
    private double precioUnitario;
    private int cantidadUnidades;

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the cantidadUnidades
     */
    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    /**
     * @param cantidadUnidades the cantidadUnidades to set
     */
    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public Ej4LineaFactura(String descripcion, double precioUnitario, int cantidadUnidades) {
        super();
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadUnidades = cantidadUnidades;
    }

    /**
     * Devuelve el descuento de la línea, un 5% si la cantidad es mayor a 10
     * 
     * @return
     */
    public int getDescuento() {
        if (this.cantidadUnidades > 10)
            return 5;
        else
            return 0;
    }

    public double importeTotal() {
        return (this.cantidadUnidades * this.precioUnitario * (100 - this.getDescuento()) / 100);
    }

    @Override
    public String toString() {
        return String.format("%-30s %15.2f %15d %15d %15.2f", descripcion, precioUnitario,
                cantidadUnidades, getDescuento(), importeTotal());
    }
}