package Ej6;

public class Circulo implements Figura2D {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        int area = (radio * 2) * Math.PI;
        return area;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0)
            this.radio = radio * 2;

    }

    @Override
    public void imprimir() {
        System.out.println("El perimetro del circulo es: " + perimetro() + " y el area es: " + area());

    }

    @Override
    public double perimetro() {
        double perimetro = (2 * Math.PI) * this.radio;
        return perimetro;
    }

}
