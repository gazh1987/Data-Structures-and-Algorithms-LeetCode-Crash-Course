package Dsa;

public class ArraySubstrings {
	
	public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0) {
        	return 0;
        }
        
        // Find initial maxArr with k elements
        double currSum = 0;
        for (int i = 0; i < k; i ++) {
        	currSum += nums[i];
        }
        double maxAvg = currSum / k;
        
        // Find max average
        for (int right = k; right < nums.length; right++) {	
        	currSum = currSum - nums[right-k] + nums[right];
        	maxAvg = Math.max(maxAvg, currSum / k);
        }
        
        return maxAvg;
    }
}
