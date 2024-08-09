class A{
    
    int x = 18;
    int y = 2;
    public void show() throws Exception{
     if(x/y<=0){
        throw new ArithmeticException();
     }
     Class.forName("B");
}
    
}


public class Q6{
   
    public static void main(String[] args) {
        A a = new A();
        try{
        a.show();
        } catch(ArithmeticException e){
            System.out.println("cant divide by zero");
        } catch(ClassNotFoundException c){
            System.out.println("Class not exist");
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
