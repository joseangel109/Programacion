public class Ej1Astros {

        //Info enunciado
        double diametroMedio;
        double periodoTraslacion;
        double distanciaEcuatorial;

        //Info del UML
        float radioEcuatorial;
        float rotacionEje;
        float masa;
        float temperaturaMedia;
        float gravedad;

        //Constructor
        public Ej1Astros(float radioEcuatorial, float rotacionEje, float masa, float temperaturaMedia, float gravedad) {
            this.radioEcuatorial = radioEcuatorial;
            this.rotacionEje = rotacionEje;
            this.masa = masa;
            this.temperaturaMedia = temperaturaMedia;
            this.gravedad = gravedad;
        }
        //Getters and Setters

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
        

    }
