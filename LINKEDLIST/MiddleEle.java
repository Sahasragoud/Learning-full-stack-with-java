import java.util.List;
import java.util.LinkedList;

public class MiddleEle {
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(8);
        nums.add(6);
        nums.add(2);
        nums.add(2);
        Object result = mid(nums);
        System.out.println(result);
    }

    public static Object mid(List<Integer> list){
        int mid = (list.size()-1)/2;
        return (list.get(mid));

    }
}





