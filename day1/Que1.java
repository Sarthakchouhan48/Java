package day1;
import java.util.*;

public class Que1
{
    public static void main(String []args){
        List<Integer> l1 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many number of elements you wants to enter");
        int n = sc.nextInt();
        while(n!=0){
            int x = sc.nextInt();
            l1.add(x);
            n--;
    }
        System.out.println("Before removing");
        for(int j : l1){
            System.out.println(j);
        }
        System.out.println("Index number to remove element");
        int m = sc.nextInt();
        l1.remove(m);
        System.out.println("After removing");
        for(int j : l1){
            System.out.println(j);
        }
        sc.close();
    }

}