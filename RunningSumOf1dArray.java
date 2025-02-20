package Dsa;

public class RunningSumOf1dArray {
	
	public int[] runningSum(int[] nums) {
		
		if (nums == null) {
			return null;
		}
		
		if (nums.length < 2) {
			return nums;
		}
		
		// Runs in O(n) time, O(1) space.
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i-1];
		}
		
		return nums;
    }
}
