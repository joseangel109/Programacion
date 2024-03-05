package Biblioteca;

public class ValorIncorrecto extends Exception {
    // Clase ValorIncorrecto. Esta clase hereda de Exception y tiene un nuevo
    // atributo valor, con un constructor al que se le pasa ese valor. ste valor se
    // mostrará al
    // menos en el toString. Podrá tener otro constructor al que se le pasa el
    // mensaje de
    // la excepción y el valor que lo ha producido
    int valor;

    public ValorIncorrecto(int valor) {
        this.valor = valor;
    }

    public ValorIncorrecto(String message, int valor) {
        super(message);
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ValorIncorrecto [valor=" + valor + "]";
    }

}
