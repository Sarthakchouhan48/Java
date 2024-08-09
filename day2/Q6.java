import java.util.concurrent.atomic.AtomicInteger;

class X{
    static AtomicInteger count = new AtomicInteger();

    public static void getcount(){
        System.out.println(count);
    } 
}

public class Q6{
    public static void main(String[] args)  throws Exception {
        Runnable b = () -> {
            for(int i = 0; i<1000; i++){
                X.count.incrementAndGet();
        }
        };
        Runnable a = () -> {
            for(int i = 0; i<1000; i++){
                X.count.incrementAndGet();
            }
        };
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        X.getcount();

    }
}
