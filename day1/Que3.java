package day1;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Que3 {
    public static void main(String[] args) {
        Map<String,  Integer> m = new HashMap<>();
        m.put( "john", 1);
        m.put( "paul", 4);
        m.put( "steve", 2);
        m.put("tom", 3);
        System.out.println("*****HashAMap*****");
        System.out.println("-----Before removing-----");
        for(String a : m.keySet())
            System.out.println(a + " : " + m.get(a));

        m.remove("paul");
        
        System.out.println("-----After removing-----");
       
        for(String a : m.keySet())
        System.out.println(a + " : " + m.get(a));
        
        System.out.println("*****TreeAMap*****");
        
        Map<String, Integer> t = new TreeMap<>();
        t.put( "john", 1);
        t.put( "paul", 4);
        t.put( "steve", 2);
        t.put("tom", 3);
        for(String a : t.keySet())
            System.out.println(a + " : " + t.get(a));

        
    }
    
}
