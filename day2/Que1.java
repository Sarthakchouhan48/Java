
class A extends Thread
{
    public void run(){
        for(int i = 1; i<6; i++){
        System.out.println(i);
        // try {
        //     Thread.sleep(10);
        // } catch (Exception e) {
        //     System.out.println("errorrrr");
        // }
        }
    }
}

class B extends Thread
{
    public void run(){
        String str = "ABCDE";
        char[] c = str.toCharArray();
        for(char j : c){
        System.out.println(j);
        // try {
        //     Thread.sleep(10);
        // } catch (Exception e) {
        //     System.out.println("errorrrr");
        // }
    }
    }
}

public class Que1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
