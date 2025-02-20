package Dsa;

public class MinimumValueToGetPositiveStepByStepSum {

	public int minStartValue(int[] nums) {
        
		if (nums == null || nums.length == 0) {
			return 1;
		}
		
		int prefixSum = 0;
		int lowestRunningSum = 0;
		
		for (int num : nums) {
			prefixSum += num;
			lowestRunningSum = Math.min(prefixSum, lowestRunningSum);
		
		}
		
		return 1 - lowestRunningSum;
    }
}