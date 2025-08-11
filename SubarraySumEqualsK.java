package Dsa;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
	
	public int subarraySum(int[] nums, int k) {
        
		if (nums == null || nums.length == 0) {
			return 0;
		}
		
		Map<Integer, Integer> prefixCount = new HashMap<>();
		prefixCount.put(0, 1);
		
		int curr = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			
			curr += nums[i];
			
			if (prefixCount.containsKey(curr - k)) {
				count += prefixCount.get(curr - k);
			}
			
			prefixCount.put(curr, prefixCount.getOrDefault(curr, 0) + 1);
		}
		
		return count;
    }
}
