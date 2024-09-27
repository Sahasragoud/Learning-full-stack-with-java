import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        List<Integer> nums1 = new LinkedList<>();
        nums1.add(7);
        nums1.add(9);
        nums1.add(8);
        nums1.add(5);
        nums1.add(1);

        List<Integer> nums2 = new LinkedList<>();
        nums2.add(10);
        nums2.add(4);
        nums2.add(2);
        nums2.add(5);
        nums2.add(3);
        System.out.println(MergeLists(nums1,nums2));

       
    }
    public static List<Integer> MergeLists(List<Integer> list1,List<Integer> list2){
        Collections.sort(list1);
        Collections.sort(list2);
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }
}
