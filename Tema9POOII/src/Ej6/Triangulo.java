package Ej6;

public class Triangulo implements Figura2D {
    int ancho;
    int alto;

    public Triangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double area() {
        double area = (ancho * alto) / 2;
        return area;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0)
            this.ancho = ancho * 2;
        this.alto = alto * 2;
    }

    @Override
    public void imprimir() {
        System.out.println("El perimetro del triangulo es: " + perimetro() + " y el area es: " + area());

    }

    @Override
    public double perimetro() {
        double perimetro = (Math.hypot(ancho / 2, alto) * 2) + ancho;
        return perimetro;
    }

}
