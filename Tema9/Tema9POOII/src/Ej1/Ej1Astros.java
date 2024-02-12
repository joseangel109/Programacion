import java.util.ArrayList;

public abstract class Ej1Astros {

    // Info enunciado
    double diametroMedio;
    double periodoTraslacion;
    double distanciaEcuatorial;

    // Info del UML
    float radioEcuatorial;
    float rotacionEje;
    float masa;
    float temperaturaMedia;
    float gravedad;

    // Constructor
    public Ej1Astros(float radioEcuatorial, float rotacionEje, float masa, float temperaturaMedia, float gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionEje = rotacionEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }
    // Getters and Setters

    public float getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public void setRadioEcuatorial(float radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public float getRotacionEje() {
        return rotacionEje;
    }

    public void setRotacionEje(float rotacionEje) {
        this.rotacionEje = rotacionEje;
    }

    public float getMasa() {
        return masa;
    }

    public void setMasa(float masa) {
        this.masa = masa;
    }

    public float getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(float temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public float getGravedad() {
        return gravedad;
    }

    public void setGravedad(float gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(diametroMedio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(periodoTraslacion);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(distanciaEcuatorial);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + Float.floatToIntBits(radioEcuatorial);
        result = prime * result + Float.floatToIntBits(rotacionEje);
        result = prime * result + Float.floatToIntBits(masa);
        result = prime * result + Float.floatToIntBits(temperaturaMedia);
        result = prime * result + Float.floatToIntBits(gravedad);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ej1Astros other = (Ej1Astros) obj;
        if (Double.doubleToLongBits(diametroMedio) != Double.doubleToLongBits(other.diametroMedio))
            return false;
        if (Double.doubleToLongBits(periodoTraslacion) != Double.doubleToLongBits(other.periodoTraslacion))
            return false;
        if (Double.doubleToLongBits(distanciaEcuatorial) != Double.doubleToLongBits(other.distanciaEcuatorial))
            return false;
        if (Float.floatToIntBits(radioEcuatorial) != Float.floatToIntBits(other.radioEcuatorial))
            return false;
        if (Float.floatToIntBits(rotacionEje) != Float.floatToIntBits(other.rotacionEje))
            return false;
        if (Float.floatToIntBits(masa) != Float.floatToIntBits(other.masa))
            return false;
        if (Float.floatToIntBits(temperaturaMedia) != Float.floatToIntBits(other.temperaturaMedia))
            return false;
        if (Float.floatToIntBits(gravedad) != Float.floatToIntBits(other.gravedad))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ej1Astros [diametroMedio=" + diametroMedio + ", periodoTraslacion=" + periodoTraslacion
                + ", distanciaEcuatorial=" + distanciaEcuatorial + ", radioEcuatorial=" + radioEcuatorial
                + ", rotacionEje=" + rotacionEje + ", masa=" + masa + ", temperaturaMedia=" + temperaturaMedia
                + ", gravedad=" + gravedad + "]";
    }

    public abstract void muestra(ArrayList<Ej1Astros> lista);

    public static void main(String[] args) {
        ArrayList<Ej1Astros> lista = new ArrayList<>();
        Ej1Planetas planeta1 = new Ej1Planetas(10, 0, 0, 0, 0, 0, 0, true);
        Ej1Satelites satelite1 = new Ej1Satelites(0, 0, 0, 0, 0, 0, 0, planeta1);
        lista.add(satelite1);
        lista.add(planeta1);
        satelite1.muestra(lista);
    }

}
