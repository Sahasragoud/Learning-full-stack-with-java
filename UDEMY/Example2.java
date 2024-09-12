
public class Example2 {
    public static void main(String[] args){
        
        int arr[] = {2,5,6,8,9};
        try{
            System.out.println(arr[5]);
            System.out.println("this statement will not print");
        }
        catch(Exception e){
            
            System.out.println("Array element doesn't exist" + e);
        }
        System.out.println("Okay");
    }
}