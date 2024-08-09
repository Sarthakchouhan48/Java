package day1;
import java.util.PriorityQueue;

public class Que5 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        
        p.add(5);
        p.add(3);
        p.add(2);
        p.add(8);
        

        System.out.println("---------PriotrityQueue Before--------");
        System.out.println(p);
        
        p.poll();
        System.out.println("---------PriotrityQueue After removing element--------");
        System.out.println(p);
    }
}
