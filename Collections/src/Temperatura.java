import java.time.Year;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class Temperatura {
    public static void main(String[] args) {
        Map<Integer,Integer> distribucion=new TreeMap<>();
        int año=2022;
        int[] temperaturas=new int[((Year.isLeap(año))?366:365)];
        for (int i=0; i<temperaturas.length;i++){
            temperaturas[i]=ThreadLocalRandom.current().nextInt(10,31);
        }
        for (int i = 0; i < temperaturas.length; i++) {
            distribucion.put(temperaturas[i],distribucion.getOrDefault(temperaturas[i], 0)+1);
        }

        for (int clave : distribucion.keySet()) {
            System.out.println("Temperatura "+clave+" : "+distribucion.get(clave)+" dias");
        }
    }


}
