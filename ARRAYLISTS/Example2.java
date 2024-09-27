
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        nums.add(5);        
        nums.add(9);
        nums.add(8);
        nums.add(10);
        System.out.println(nums);
        int n = nums.size();

        for(int i = 0; i < n/2;i++){
            if (i <= k){
            int temp = nums.get(i);
            nums.set(i,nums.get(n-i-1));
            nums.set((n-i-1),temp);
        }}
        System.out.println(nums);
        sc.close();
    }
}
