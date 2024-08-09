import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Q1{

    public static void main(String[] args) {
        File f ;
        FileWriter ff = null;
        FileReader fr = null;
        Scanner sc = null; 

try{
    f = new File("ff.txt");
    String str = "Good Morning Aliens";
    if(f.createNewFile()){
        System.out.println(" file " + f.getName() + " created.");
    }
    ff = new FileWriter(f);
    if(f.canWrite()){
        
        ff.write(str);
        System.out.println("----written----");
    }
    if(f.canRead()){
        
        fr = new FileReader(f);
        System.out.println(fr.toString());
        System.out.println("----Reading done----");
    }
}
catch(Exception e){
System.out.println("Not opened");
}
finally{
    try{
    ff.close();
    System.out.println("------Closed----");
    }
    catch(Exception e){
        System.out.println("dikkat h");
    }
    sc.close();
}
}
}
