
class X{
    int count;
    public synchronized void counter(){
        count++;
    }
}

public class Q2{
    public static void main(String[] args)  throws Exception {
        X x = new X();
        Runnable b = () -> {
            for(int i = 0; i<1000; i++){
                x.counter();
        }
        };
        Runnable a = () -> {
            for(int i = 0; i<1000; i++){
                x.counter();
            }
        };
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(x.count);

    }
}
