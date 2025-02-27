package Dsa;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (dic.containsKey(complement)) { // This operation is O(1)!
                return new int[] { dic.get(complement), i };
            }
            dic.put(nums[i], i);
        }

        return new int[] { -1, -1};
    }
}