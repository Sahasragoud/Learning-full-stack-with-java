
public class Example4 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        try{
            int[] arr = new int[7];
            arr[10]=20/10;
        }catch(ArithmeticException e){
            System.out.println("Arithematic Exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception");
        }catch(Exception e){
            System.out.println("Other exception");
        }
        
    }
}   

    
