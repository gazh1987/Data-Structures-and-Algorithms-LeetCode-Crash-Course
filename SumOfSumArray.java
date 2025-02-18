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
		
		// Precompute prefix sum for O(1) range queries (trades space for speed)
		int[] prefix = initialisePrefixArray(nums);
		
		// Return Sum Of Sum Array
		return prefix[finishIndex] - (startIndex > 0 ? prefix[startIndex-1] : 0);
	}
	
	public boolean[] answerQueries(int[] nums, int[][] queries, int limit) {
		if (nums == null || nums.length == 0 ||
				queries == null || queries.length == 0) {
			return new boolean[0];
		}
		
		int[] prefix = initialisePrefixArray(nums);
		boolean[] answeredQueries = new boolean[queries.length];
		int startIndex, finishIndex;
		
		// Note, there will only ever be two element in the queries subarray
		for (int i = 0; i < queries.length; i ++) {
			startIndex = queries[i][0];
			finishIndex = queries[i][1];
			
			if (startIndex < 0 || finishIndex >= nums.length || startIndex > finishIndex) {
				answeredQueries[i] = false;
			}
			else {
				answeredQueries[i] = 
						prefix[finishIndex] - (startIndex > 0 ? prefix[startIndex-1] : 0) < limit;
			}
		}
		
		
		return answeredQueries;
	}
	
	private int[] initialisePrefixArray (int[] nums) {
		int[] prefix = new int[nums.length];
		prefix[0] = nums[0];
		
		for (int i = 1; i < nums.length; i ++) {
			prefix[i] = nums[i] + prefix[i-1]; 
		} 
		
		return prefix;
	}
}
