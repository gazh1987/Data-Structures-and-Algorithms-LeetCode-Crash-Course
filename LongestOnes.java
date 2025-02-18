package Dsa;

public class LongestOnes {
	
	public int longestOnes(int[] nums, int k) {
		
		if (nums.length == 0) {
			return 0;
		}
		
		if (k > nums.length) {
			return nums.length;
		}
		
		int zeroCount = 0, longestOnes = 0, left = 0;
		
		for (int right = 0; right < nums.length; right ++) {
			
			if (nums[right] == 0) {
				zeroCount++;
			}
			
			while (zeroCount > k) {
				if (nums[left] == 0) {
					zeroCount--;
				}
				left++;
			}
			
			longestOnes = Math.max(longestOnes, right - left + 1);
			
		}
		
		return longestOnes;
    }
}


/**
k = 2
totalOnes = 2
longestOnes = 6

                       l              r   
nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0]



*/