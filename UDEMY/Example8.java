
public class Example8 {
    
    public static void main(String[] args) {
        System.out.println("finally when there is an exception");
        try{
            int data = 35/0;
        }catch(NullPointerException e){
            System.out.println(e);
        }finally{
            System.out.println("finally block is exected though the exception is not handled");
        }
    }
    
}