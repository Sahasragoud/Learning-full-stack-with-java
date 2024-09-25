import java.util.Scanner;
public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter the elements seperated by space: ");
        for(int i = 0; i< n; i++ ){
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        for(int i = 0; i< n; i++ ){
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("Maximum in the array is: "+ max);
    }
}