package Dsa;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
	
	
	// missinNumber method using a set as the exercise is about Hashing.  
	// Added the much quicker method missingNumberFast which does not use hashing
	
	public int missingNumber(int[] nums) {
		
		if (nums == null || nums.length < 2) {
			throw new IllegalArgumentException("Nums Array Length must have more than 1 element");
		}
		
		Set<Integer> numsSet = new HashSet<Integer>();
		
		for (int n : nums) {
			numsSet.add(n);
		}
		
		for (int i = 0; i < nums.length + 1; i ++){
			if (!numsSet.contains(i)) {
				return i;
			}
		}
		
		throw new IllegalStateException("No missing number found");
    }
	
	public int missingNumberFast(int[] nums) {
		
		int sumOfNums = 0;
		int sumOfIndex = 0;
		for(int i = 0; i < nums.length; i++) {
			sumOfNums += nums[i];
			sumOfIndex += i + 1;
		}
		
		return sumOfIndex - sumOfNums;
	}
}