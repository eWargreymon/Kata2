package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        Integer data[] = new Integer[]{1,6,4,6,23,6,0,1,2,3,4,2,6,0,10};
        Histogram histo = new Histogram(data);
                
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for(Integer key : histogr.keySet()){
            
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
}
