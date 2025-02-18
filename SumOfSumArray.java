package Dsa;

public class SumOfSumArray {
	public int sumOfSubArray(int[] nums, int startIndex, int finishIndex) {
		
		if (nums == null ||
				nums.length == 0 || 
				startIndex < 0 || 
				startIndex > finishIndex || 
				finishIndex >= nums.length) {
			return 0;
		}
		
		// Initialize a prefix array (I know this isn't memory efficient and we can do this 
		// in O(1) using a for loop, but playing around with basic pre-computation for this 
		// exercise
		int[] prefix = new int[nums.length];
		prefix[0] = nums[0];
		
		for (int i = 1; i < nums.length; i ++) {
			prefix[i] = nums[i] + prefix[i-1]; 
		} 
		
		// Return Sum Of Sum Array
		return prefix[finishIndex] - (startIndex > 0 ? prefix[startIndex-1] : 0);
	}
}
