package Ej3;

public static final class CuentaAhorro extends CuentaBancaria {
    float saldoMinimo = 3000;

    public CuentaAhorro(String iban, float saldoMinimo) {
        super(iban);
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String toString() {
        return "CuentaAhorro [saldoMinimo=" + saldoMinimo + "]";
    }

}
