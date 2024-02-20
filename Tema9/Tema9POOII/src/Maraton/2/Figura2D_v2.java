package Maraton;

public abstract class Figura2D_v2 {
    private float ancho;
    private float alto;

    public Figura2D_v2(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Figura2D [ancho=" + ancho + ", alto=" + alto + "]";
    }

    void verDim() {
        
        System.out.println("El ancho del triangulo es de: "+String.format("%.2f", ancho)+" y el alto del triangulo es: "+String.format("%.2f", alto));
    }
    void area(){

    }
    void verEstilo(){
        
    }
}
