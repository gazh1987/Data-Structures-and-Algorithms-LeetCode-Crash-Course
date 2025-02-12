package Dsa;

public class ReverseString {
	
	public String reverseString(String s) {
		if (s == null) {
			return null;
		}
		char[] charArray = s.toCharArray();
		charArray = reverseCharArrayInPlace(charArray);
		return new String(charArray);
		
	}
	
	/**
	 *  Reverses the given Characters of an array in place
	 *  @param s the characters of an array to be  (modified in place)
	 *  @return the same character array reversed
	 *  */
	public char[] reverseCharArrayInPlace(char[] s) {
		if (s == null) {
			return null;
		}
		
		int i = 0, j = s.length -1;
		char t;
		
		while (i < j) {
			t = s[i];
			s[i] = s[j];
			s[j] = t;
			
			i++;
			j--;
		}
				
		return s;
	}
}
