import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio13 {
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

        Set<Entry<Integer,Integer>> entradasMapa= distribucion.entrySet();
        ArrayList<Entry<Integer,Integer>> listaEntradas=new ArrayList<>(entradasMapa);
        Collections.sort(listaEntradas,new Comparator<Entry<Integer,Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> arg0, Entry<Integer, Integer> arg1) {
                return arg0.getValue().compareTo(arg1.getValue());
            }
            
        });

        for (Entry<Integer,Integer> entrada : listaEntradas) {
            System.out.println("Temperatura: "+entrada.getKey()+" dias "+entrada.getValue());
        }
    }
}
