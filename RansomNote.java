package Dsa;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
    	final Map<Character, Integer> charFrequency = new HashMap<>();
        
        for (char c : magazine.toCharArray()) {
        	charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);   
        }
        
        for (char c : ransomNote.toCharArray()) {
        	
        	Integer val = charFrequency.get(c);
        	
        	if (val == null || val < 1) {
        		return false;
            }
        	else {
        		charFrequency.put(c, val -1);
        	}
        }
        
        return true;
    }
}
