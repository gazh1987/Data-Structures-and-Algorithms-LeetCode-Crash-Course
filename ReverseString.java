package Dsa;

public class ReverseString {
	
	ReverseString(){	
	}
	
	String reverseString(String s) {
		char [] newString = new char[s.length()];
		int i = 0;
		int j = s.length() -1;
		char t;
		
		while (i <= j) {
			// need to save the char at i as we increment i @ line 17
			t = s.charAt(i);
			newString[i++] = s.charAt(j);
			newString[j--] = t;
		}
				 
		return String.valueOf(newString);
	}
	
	char[] reverseCharArray(char[] s) {
		int i = 0, j = s.length -1;
		char t;
		
		while (i <= j) {
			t = s[i];
			s[i++] = s[j];
			s[j--] = t;
		}
				
		return s;
	}
	

	public void reverseStringRecursive(char[] s) {
	    reverse(s, 0, s.length - 1);
	    System.out.print(String.valueOf(s));
  	}
	
	public void reverse(char[] s, int left, int right) {
	    if (left >= right) return;
	    char tmp = s[left];
	    s[left++] = s[right];
	    s[right--] = tmp;
	    
	    reverse(s, left, right);
	}
}
