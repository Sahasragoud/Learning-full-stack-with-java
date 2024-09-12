
public class Example7 {
    
    public static void main(String[] args) {
        System.out.println("finally when no exception");
        try{
            int data = 25/5;
        }catch(NullPointerException e){
            System.out.println(e);
        }finally{
            System.out.println("finally block is always exected");
        }
    }
    
}