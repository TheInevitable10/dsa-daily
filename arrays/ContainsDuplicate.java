import java.util.*;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
     }

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 1};
        System.out.println(obj.containsDuplicate(nums)); // expected: true
    }
}
