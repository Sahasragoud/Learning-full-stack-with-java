import java.util.List;
import java.util.LinkedList;
public class RevList {
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(8);
        nums.add(6);
        nums.add(2);
        System.out.println(nums);

        int n = nums.size();

        for(int i = 0; i < n/2; i++){
            int temp = nums.get(i);
            nums.set(i,nums.get(n-i-1));
            nums.set(n-i-1,temp);
        }
        System.out.println(nums);
    }
}
