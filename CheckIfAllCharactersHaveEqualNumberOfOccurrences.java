package Dsa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
	public boolean areOccurrencesEqual(String s) {
		
		if (s == null) {
			return false;
		}
		
		if (s.length() <= 1) {
			return true;
		}
		
		Map<Character, Integer> freqMap = new HashMap<>();
		
		for (char c : s.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}
		
		Set<Integer> frequencies = new HashSet<>(freqMap.values());
		
		return frequencies.size() == 1;
    }
}