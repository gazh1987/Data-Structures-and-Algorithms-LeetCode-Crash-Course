package Dsa;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
	
	public int countElements(int[] arr) {
		if (arr == null) {
			throw new IllegalArgumentException("Input Array can not be null");
		}
		
		// Input arr of length 0 or 1 can not contain any elements of n + 1
		if (arr.length < 2) {
			return 0;
		}
		
		Set<Integer> set = new HashSet<>();
		int count = 0;
		
		for (int n : arr) {
			set.add(n);
		}
		
		for (int n : arr) {
			if(set.contains(n + 1)) {
				count++;
			}
		}
		
		return count;
    }

}
