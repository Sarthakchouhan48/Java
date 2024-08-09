package day1;
import java.util.*;

public class Que2 {
    
    public static void main(String[] args) {
           Set<String> S1 = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many number of Strings you wants to enter");
        int n = sc.nextInt();
        System.out.println("Enter strings");
        for(int i=0; i<n; i++){
            String str = sc.next();
            S1.add(str);
        }
        System.out.println("------FINAL OUTPUT----");
        for(String e : S1){
            System.out.println(e);
        }
        sc.close();
}
}
