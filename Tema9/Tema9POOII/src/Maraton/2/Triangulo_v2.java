package Maraton;

public class Triangulo_v2 extends Figura2D_v2 {
    String estilo;
    

    public Triangulo_v2(float ancho, float alto) {
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
