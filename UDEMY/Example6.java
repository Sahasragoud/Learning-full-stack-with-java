
public class Example6 {
    
    public static void main(String[] args) {
        System.out.println("Nested try block");
        
        try{
            try{
                System.out.println("going to divide");
                int d = 39/0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[] = new int[5];
                a[5] = 20/10;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            
        }catch(Exception e){
                System.out.println("handled");
            }
        System.out.println("normal flow");
    }
    
}