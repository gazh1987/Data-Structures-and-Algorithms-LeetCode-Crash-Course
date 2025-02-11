package Dsa;

public class ReverseString {
	
	ReverseString(){	
	}
	
	String reverseString(String s) {
		char [] newString = new char[s.length()];
		int i = 0;
		int j = s.length() -1;
		
		while (i <= j) {
			newString[i] = s.charAt(j);
			newString[j] = s.charAt(i);
			i++;
			j--;
		}
				 
		return String.valueOf(newString);
	}
	
	char[] reverseCharArray(char[] s) {
		int i = 0;
		int j = s.length -1;
		char t;
		
		while (i <= j) {
			t = s[i];
			s[i] = s[j];
			s[j] = t;
			i++;
			j--;
		}
				
		return s;
	}
}
