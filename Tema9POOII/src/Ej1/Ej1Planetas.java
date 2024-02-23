package Ej1;

import java.util.ArrayList;

public class Ej1Planetas extends Ej1Astros {
    float distanciaSol;
    float orbitaSol;
    boolean tieneSatelites;

    public Ej1Planetas(float radioEcuatorial, float rotacionEje, float masa, float temperaturaMedia, float gravedad,
            float distanciaSol, float orbitaSol, boolean tieneSatelites) {
        super(radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
    }

    @Override
    public String toString() {
        return "Ej1Planetas [distanciaSol=" + distanciaSol + ", orbitaSol=" + orbitaSol + ", tieneSatelites="
                + tieneSatelites + "]" + super.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Float.floatToIntBits(distanciaSol);
        result = prime * result + Float.floatToIntBits(orbitaSol);
        result = prime * result + (tieneSatelites ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ej1Planetas other = (Ej1Planetas) obj;
        if (Float.floatToIntBits(distanciaSol) != Float.floatToIntBits(other.distanciaSol))
            return false;
        if (Float.floatToIntBits(orbitaSol) != Float.floatToIntBits(other.orbitaSol))
            return false;
        if (tieneSatelites != other.tieneSatelites)
            return false;
        return true;
    }

    public float getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(float distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public float getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(float orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    public void muestra(ArrayList<Ej1Astros> lista) {
        System.out.println(toString());
        if (tieneSatelites) {
            for (Ej1Astros astro : lista) {
                if (astro instanceof Ej1Satelites) {
                    Ej1Satelites tmp = (Ej1Satelites) astro;
                    if (tmp.getPlanetaPertenece().equals(this)) {
                        System.out.println(tmp.toString());
                    }
                }
            }
        }
    }
}
