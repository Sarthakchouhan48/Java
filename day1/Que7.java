package day1;
import java.util.*;

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + ":" + age ;
    }
}

public class Que7 {

    public static void main(String[] args) {
        
        Comparator<Person> comp = (p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()); // Lambda expression
        
        TreeSet<Person> t = new TreeSet<>(comp);

        t.add(new Person("john", 21));
        t.add(new Person("steve", 29));
        t.add(new Person("tom", 32));
        t.add(new Person("toby", 25));

        System.out.println(t);
        
    }
}





// class comp implements Comparator<Person>{

//     @Override
//     public int compare(Person p1, Person p2) {

//         return Integer.compare(p1.getAge(), p2.getAge());
//     }
  
// }