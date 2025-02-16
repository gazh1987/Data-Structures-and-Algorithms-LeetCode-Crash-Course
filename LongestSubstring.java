package Dsa;

public class LongestSubstring {
	
	public int longestSubstringThatContainsOneZero(int[] nums) {
		
		int maxLength = 0, zeroCount = 0, l = 0;
		
		for (int r = 0; r < nums.length; r++) {
			if (nums[r] == 0) {
				zeroCount++;
			}
			
			while (zeroCount > 1) {
				if (nums[l] == 0) {
					zeroCount--;
				}
				l++;
			}
			
			maxLength = Math.max(maxLength, r - l + 1);
		}
		
		return maxLength;
	}
}






