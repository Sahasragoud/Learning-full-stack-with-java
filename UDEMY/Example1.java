
public class Example1 {
    public static void main(String[] args){
        try{
            
            int data = 50/0;
            
        }/*catch(ArithmeticException e){
            
            System.out.println("cannot be divided by zero");
        }*/
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    }