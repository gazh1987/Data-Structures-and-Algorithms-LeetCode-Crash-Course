package Dsa;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
		
		Set<Integer> uniqueElements = new HashSet<>();
		
		for (int i : nums) {
			if (uniqueElements.contains(i)) {
				return true;
			}
			uniqueElements.add(i);
		}
		
		return false;
    }
}
