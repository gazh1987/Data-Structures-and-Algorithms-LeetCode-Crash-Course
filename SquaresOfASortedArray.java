package Dsa;

public class SquaresOfASortedArray {
	
	/**
	 * 
	 * @param a sorted int array (ascending order), which may contain negative values
	 * @return a new int array with each value squared and sorted
	 * 
	 * Runs in o(n) time
	 */

	public int[] sortedSquaredSort(int[] nums) {
		
		if(nums == null || nums.length == 0) {
			return new int[0];
		}

		int left = 0, right = nums.length-1, insertIndex = nums.length - 1;
		int[] numsSorted = new int[nums.length];
		
		//Two Pointer Approach
		while (left <= right) {
			if (Math.abs(nums[left]) < Math.abs(nums[right])) {
				numsSorted[insertIndex] = nums[right] * nums[right];
				right--;
			}
			else {
				numsSorted[insertIndex] = nums[left] * nums[left];
				left++;
			}
			insertIndex--;
		}
			
		return numsSorted;
    }
}
