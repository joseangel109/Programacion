package Maraton;

public class Triangulo extends Figura2D {
    String estilo;
    

    public Triangulo(float ancho, float alto) {
        super(ancho, alto);
        // TODO Auto-generated constructor stub
    }   

    void area() {
        float area = (ancho * alto) / 2;
        System.out.println("El area del triangulo es: "+area);
    }

    void verEstilo() {
        System.out.println("El estilo de triangulo es:"+estilo);
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
