package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int data[] = new int[]{1,6,4,6,23,6,0,1,2,3,4,2,6,0,10};
        Map <Integer,Integer> histogram = new HashMap<>();
        
        for (int i : data) {
            
            histogram.put(i,histogram.containsKey(i)? histogram.get(i)+1 : 1);
        }
        
        for(Integer key : histogram.keySet()){
            
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
}
