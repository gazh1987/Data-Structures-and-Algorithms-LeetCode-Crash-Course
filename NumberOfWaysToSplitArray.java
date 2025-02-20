package Dsa;

public class NumberOfWaysToSplitArray {
	
	public int waysToSplitArray(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		
		return findSplitWaysUsingRunningSum(nums);
    }
	
	private int findSplitWaysUsingRunningSum(int[] nums) {
		int splitWays = 0;
		long prefixSum = 0;
		long totalSum = 0;
		
		for (int num : nums) {
			totalSum += num;
		}
		
		for(int i = 0; i < nums.length-1; i++) {
			prefixSum += nums[i];
			
			if (prefixSum >= totalSum - prefixSum) {
				splitWays++;
			}
		}
		
		return splitWays;
	}
	
	// Unused alternative approach using a prefix array. Less efficient as computePrefixArray is o(n)
	private int findSplitWaysUsingPrefixArray(int[] nums) {
		int splitWays = 0;
		long[] prefixSum = computePrefixArray(nums);
		
		for (int i = 0; i < prefixSum.length-1; i++) {
			
			if (prefixSum[i] >= prefixSum[prefixSum.length-1] - prefixSum[i]) {
				splitWays++;
			}
		}
		
		return splitWays;
	}

	private long[] computePrefixArray(int[] nums) {
		
		long[] prefix = new long[nums.length];
		prefix[0] = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			prefix[i] = nums[i] + prefix[i-1];
		}
		
		return prefix;
	}
}
