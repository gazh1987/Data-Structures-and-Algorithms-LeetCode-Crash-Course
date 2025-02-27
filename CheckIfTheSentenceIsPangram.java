package Dsa;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
	
	public boolean checkIfPangram(String sentence) {
    
		if (sentence == null || sentence.isEmpty() || sentence.length() < 26) {
			return false;
		}

		Set<Character> seenLetters = new HashSet<>();
		
		for (char c : sentence.toCharArray()) {
			seenLetters.add(c);
			
			if (seenLetters.size() == 26) {
				return true;
			}
		}
		
		return false;
    }
}
