package tema8.joseangel;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Facturas {
    private int numeroIdentificador;
    String fechaFactura;
    final String LocalDate;
    private int numeroCliente;
    private final int iva = 21;
    private int porcentaje;
    LineaFactura linea1 = new LineaFactura();
    Double importeTotal;

    public Facturas(int numeroIdentificador, String LocalDate, int numeroCliente, LineaFactura linea1,
            Double importeTotal) {
        this.numeroIdentificador = numeroIdentificador;
        this.fechaFactura = LocalDate;
        this.numeroCliente = numeroCliente;
        this.linea1 = linea1;
        importeTotal= linea1.getImporteTotalLinea()+importeTotal;
        this.importeTotal = importeTotal;
    }

}
