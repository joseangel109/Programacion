package tema8.joseangel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ej4Factura {
    private String identificador;
    private LocalDate fechaAlta;
    private String numeroCliente;
    private static final int IVA = 21;
    private ArrayList<Ej4LineaFactura> lineas;
    private double importeTotal;

    public Ej4Factura(String identificador, String numeroCliente) {
        this.identificador = identificador;
        this.numeroCliente = numeroCliente;
        this.fechaAlta = LocalDate.now();
        this.lineas = new ArrayList<>();
        this.importeTotal = 0;
    }

    public void anyadirLinea(String descripcion, double preciou, int cantidad) {
        Ej4LineaFactura linea = new Ej4LineaFactura(descripcion, preciou, cantidad);
        importeTotal += linea.importeTotal();
        lineas.add(linea);
    }

    public void quitarLinea(int indice) {
        Ej4LineaFactura linea = lineas.remove(indice);
        importeTotal -= linea.importeTotal();
    }

    public void mostrarFactura() {
        System.out.println("FACTURA");
        System.out.println("Id: " + this.identificador);
        System.out.println("Fecha: " + this.fechaAlta);
        System.out.println("Cliente: " + this.numeroCliente);
        System.out.printf("%-30s %15s %15s %15s %15s%n", "Descripción", "Precio", "Cantidad",
                "Descuento", "Importe");
        // Fuente:
        // https://www.iteramos.com/pregunta/3518/forma-sencilla-para-repetir-una-cadena-en-java
        System.out.println(new String(new char[102]).replace("\0", "_"));
        System.out.println();
        for (Ej4LineaFactura linea : lineas)
            System.out.println(linea);
        System.out.printf("IMPORTE TOTAL: %.2f%n", this.importeTotal);
    }
}