
public class Q3 {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for(int i = 0; i<10; i++){
            System.out.println("hi");
            try{
            Thread.sleep(70);
            }
            catch(Exception e){
                System.out.println("errorrrrrr");
            }
        }
    };
        Runnable obj2 = () -> {
            for(int i = 0; i<10; i++){
            System.out.println("-------");
            try{
                Thread.sleep(70);
                }
                catch(Exception e){
                    System.out.println("errorrrrrr");
                }
            }
    };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{
            Thread.sleep(30);
            }
            catch(Exception e){
                System.out.println("errorrrrrr");
            }
        t2.start();

    }
}
