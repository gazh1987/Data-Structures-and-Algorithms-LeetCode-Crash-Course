package Dsa;

public class KradiusSubarrayAverages {
	public int[] getAverages(int[] nums, int k) {
        
		if (nums == null || nums.length == 0) {
			return new int[0];
		}
		
		long[] prefixSum = new long[nums.length];
		prefixSum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			prefixSum[i] = nums[i] + prefixSum[i-1];
		}
		
		int[] averagesArray = new int[nums.length];
		int subArraySize = k * 2 + 1;
		
		for (int i = 0; i < prefixSum.length; i++) {	
			if (i < k || i + k > prefixSum.length - 1) {
				averagesArray[i] = -1;
			}
			else {
				long right = prefixSum[i + k];
				long left = i - k > 0 ? prefixSum[i - k - 1] : 0;
				long avg = (right - left) / subArraySize;
				averagesArray[i] = (int) avg;
			}
		}
		
		return averagesArray;
    }
}

/**
 *                    i           i
 *  nums = 7, 4,  3,  9,  1,  8,  5,  2,  6  
 *  pre  = 7, 11, 14, 23, 24, 32, 37, 39, 45
 *  new  = -1,-1, -1,
 *  k = 3
 *  
 *  39-7/3*2+1
	
	
	
	Output: [-1,-1,-1,5,4,4,-1,-1,-1]
 */

