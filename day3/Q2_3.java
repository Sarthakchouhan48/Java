class cstmException extends Exception{
    public cstmException(String str){

        super(str);

    }
}
class A extends cstmException {
    
    public A(String str)
    {
        super(str);
    }

    
}

public class Q2_3{
    public static void main(String[] args) {
        int j = 12;
        int k = 18;
        int l = 0;
        
        try{
            l = j/k;
            if(l<=0){
                throw new A ("done");
            }
        }
        catch(A e){
            System.out.println("let it be " + e);
        }
        



       
    }
}