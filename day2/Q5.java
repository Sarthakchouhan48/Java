// import java.util.ArrayDeque;
// import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class Q5 {
    static BlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);
    static int count = 0;
    public static void main(String[] args) {
        Producer p = new Producer();
        Consumer q = new Consumer();
        p.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        q.start();
            
    }
    static class Producer extends Thread{
        
        public void run(){
            while(true){
                try {
                    count++;
                    q.add(count);
                    System.out.println("adding id : " + count);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    
    static class Consumer extends Thread{
        public void run(){
           while (true) { 
            try {
                System.out.println("consumed id : " + count );
                q.remove();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Not in stock");
            }
        }
    }
    }
}
