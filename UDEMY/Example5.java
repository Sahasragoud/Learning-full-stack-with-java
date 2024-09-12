
public class Example5 {
    
    public static void main(String[] args) {
        try{
            int[] arr = new int[7];
            arr[7]=20/0;
        }catch(Exception e){
            System.out.println("Other exception"+e);
        }
        
        /*catch(ArithmeticException e){
            System.out.println("Arithematic Exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception");
        }*/
        
        //if we uncomment those statements we get compile time errors 
        //bcz they had already handled by the 1st catch block (exception- superclass)
        //exception handling is also based on order of tye catch blocks
    }
    
}