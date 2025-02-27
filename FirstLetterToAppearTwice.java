package Dsa;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
	
	public char repeatedCharacter(String s) {
		
		if (s == null || s.isEmpty()) {
			return '\0';
		}
		
		Set<Character> charSet = new HashSet<>();
		
		for (char c : s.toCharArray()){
			
			if (!charSet.add(c)) {
				return c;
			}
		}
		
		return '\0';
    }
}
