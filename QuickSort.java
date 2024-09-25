import java.util.Scanner;
public class QuickSort {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i = 0; i< n; i++ ){
            nums[i] = sc.nextInt();
        }
            
        quickSort(nums,0,n-1);
       for(int i = 0; i< n; i++ ){
            if(i>0) System.out.print(", ");
            System.out.print(nums[i]);
        }
            System.out.println();
            sc.close();
        }
    public static void quickSort(int[] nums,int low,int high){
        if(low < high){
            int piIdx= partition(nums,low,high);
            quickSort(nums,low,piIdx-1);
            quickSort(nums,piIdx+1,high);
        }
    }
    
    public static int partition(int[] nums,int low,int high){
        int pi = nums[high];
        int i = low-1;
        
        for(int j = low; j< high;j++){
            if(nums[j] < pi){
                i++;
                //swap nums[i] & nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }}
            //swap nums[i+1] & nums[high]
            int temp = nums[i+1];
                nums[i+1] = nums[high];
                nums[high] = temp;
        
        return i+1;
    }
}