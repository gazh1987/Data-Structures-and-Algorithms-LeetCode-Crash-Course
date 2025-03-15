package Dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfMultipleArrays {
	
	public List<Integer> intersection(int[][] nums) {
		
		if (nums == null || nums.length == 0) {
			return Collections.emptyList();
		}
		
        List<Integer> intersectedValues = new ArrayList<>();
        Map<Integer, Integer> elementFrequencyMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            	elementFrequencyMap.put(nums[i][j], elementFrequencyMap.getOrDefault(nums[i][j], 0) + 1);
            }
        }
        
        for (int key : elementFrequencyMap.keySet()) {
        	if (elementFrequencyMap.get(key) == nums.length) {
        		intersectedValues.add(key);
        	}
        }
        
        Collections.sort(intersectedValues);
        
        return intersectedValues;   
	}
}