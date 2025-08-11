package Dsa;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
	
	public int numJewelsInStones(String jewels, String stones) {
		Set<Character> jewelSet = new HashSet<>(jewels.length());
		
		for (char c : jewels.toCharArray()) {
			jewelSet.add(c);
		}
		
		int count = 0;
		
		for (char c : stones.toCharArray()) {
			if (jewelSet.contains(c)) {
				count++;
			}
		}
		
		return count;
    }

}
