package Ej1;

import java.util.ArrayList;

public class Ej1Satelites extends Ej1Astros {
        float distaciaPlaneta;
        float orbitaPlanetaria;
        Ej1Astros planetaPertenece;

        public Ej1Satelites(float radioEcuatorial, float rotacionEje, float masa, float temperaturaMedia,
                        float gravedad, float distaciaPlaneta, float orbitaPlanetaria, Ej1Astros planetaPertenece) {
                super(radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad);
                this.distaciaPlaneta = distaciaPlaneta;
                this.orbitaPlanetaria = orbitaPlanetaria;
                this.planetaPertenece = planetaPertenece;
        }

        @Override
        public int hashCode() {
                final int prime = 31;
                int result = super.hashCode();
                result = prime * result + Float.floatToIntBits(distaciaPlaneta);
                result = prime * result + Float.floatToIntBits(orbitaPlanetaria);
                result = prime * result + ((planetaPertenece == null) ? 0 : planetaPertenece.hashCode());
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
                Ej1Satelites other = (Ej1Satelites) obj;
                if (Float.floatToIntBits(distaciaPlaneta) != Float.floatToIntBits(other.distaciaPlaneta))
                        return false;
                if (Float.floatToIntBits(orbitaPlanetaria) != Float.floatToIntBits(other.orbitaPlanetaria))
                        return false;
                if (planetaPertenece == null) {
                        if (other.planetaPertenece != null)
                                return false;
                } else if (!planetaPertenece.equals(other.planetaPertenece))
                        return false;
                return true;
        }

        @Override
        public String toString() {
                return "Ej1Satelites [distaciaPlaneta=" + distaciaPlaneta + ", orbitaPlanetaria=" + orbitaPlanetaria
                                + ", planetaPertenece=" + planetaPertenece + "]" + super.toString();
        }

        public float getDistaciaPlaneta() {
                return distaciaPlaneta;
        }

        public void setDistaciaPlaneta(float distaciaPlaneta) {
                this.distaciaPlaneta = distaciaPlaneta;
        }

        public float getOrbitaPlanetaria() {
                return orbitaPlanetaria;
        }

        public void setOrbitaPlanetaria(float orbitaPlanetaria) {
                this.orbitaPlanetaria = orbitaPlanetaria;
        }

        public Ej1Astros getPlanetaPertenece() {
                return planetaPertenece;
        }

        public void setPlanetaPertenece(Ej1Astros planetaPertenece) {
                this.planetaPertenece = planetaPertenece;
        }

        public void muestra(ArrayList<Ej1Astros> lista) {
                System.out.println(toString());

        }
}
