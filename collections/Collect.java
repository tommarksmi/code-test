import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Collect {

    public static void main(String[] args) {



        ArrayList low = new ArrayList();
        ArrayList high = new ArrayList();
        ArrayList combo = new ArrayList();
        
        for(int i = 1 ; i <=10 ; i++){
            low.add(i);
        }
        for(int i = 6; i <= 15 ; i++){
            high.add(i);
        }
        
        Collections.shuffle(high);
        Collections.shuffle(low);
        
        System.out.println(low.toString() + " Size of collection one: "
                + low.size());
        
        System.out.println(high.toString() + " Size of collection tow: "
                + high.size());
        
        combo.addAll(low);
        
        for(Object i : high){
            if(!combo.contains(i)){
                combo.add(i);
            }
        }
        
        
        Collections.sort(combo);
        combo.remove((combo.size() / 2));
        Collections.reverse(combo);
        
        System.out.println();
        System.out.println(combo.toString() + " Size of combined collection: "
                + combo.size());
        
        //Using a TreeMap has the advantage of the containsKey() method running
        //in log(n) time. So if the map was to grow very large performace would
        //not suffer less. The get() and put() methods also run at log(n) time.
        
        
        TreeMap map = new TreeMap();
        
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        
        if(!map.containsKey(5)){
            map.put(5, "X");
        }
        
        System.out.println();
        System.out.println(map.toString() + " Size of collection: " + map.size());
        

        
    }

}

