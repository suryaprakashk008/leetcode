import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> set = new HashMap<>();
         for(int i =0 ;i<nums.length;i++)
         {
           int value = target-nums[i];
           if(set.containsKey(value))
           {
            return new int[]{set.get(value),i};
           }
           set.put(nums[i],i);
         }
         //throw new IllegalArgumentException("no match");
         return new int[] {-1,-1};
    }
    
}
