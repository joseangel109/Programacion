package Ej6;

public class Rectangulo implements Figura2D {
    int alto;
    int ancho;

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        double area = alto * ancho;
        return area;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0)
            this.alto = alto * 2;
        this.ancho = ancho * 2;
    }

    @Override
    public void imprimir() {
        System.out.println("El perimetro del rectangulo es: " + perimetro() + " y el area es: " + area());
    }

    @Override
    public double perimetro() {
        double perimetro = (alto * 2) + (ancho * 2);
        return perimetro;
    }

}
