package Dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		Set <Character> windowSet = new HashSet<>();
		
		int maxLen = 0;
		int i = 0, j = 0;
		
		while (j < s.length()) {
			char currChar = s.charAt(j);
			
			if (windowSet.contains(currChar)) {
				windowSet.remove(s.charAt(i));
				i++;
			}
			else {
				windowSet.add(currChar);
				j++;
			}
			maxLen = Math.max(maxLen, j - i);
		}
		
		return maxLen;
    }
}
