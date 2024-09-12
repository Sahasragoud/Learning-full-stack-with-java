
public class Example9 {
    
    public static void main(String[] args) {
        System.out.println("finally with exception handling");
        
        try{
            int data = 34/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally is executed though the exception is handled/not");
        }
    }
    
}