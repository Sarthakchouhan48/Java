public class Q4 {
    public static void main(String[] args) {
        int j = 12;
        int k = 0;
        int l = 0;
        
        try{
            String nm="rishabh";
            if(nm.length()<10){
                throw new Exception("length must be long ");
            }
            l= j/k;
            if(l<=0){
                throw new Exception("should not divide by zero");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }

