class A implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("class is closed");
    }
    
}

public class Q5{
   
    public static void main(String[] args) {
  
    try(A a = new A()){
        a.close();
    }
    catch(Exception e){
        System.out.println("Write error");
    }
}
}
