package Dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ReverseStringTests {

	@Test
	void testHelloString() {
		ReverseString hello = new ReverseString();
		String s = hello.reverseString("Hello");
		assertEquals(s, "olleH");
	}
	
	@Test
	void testHannahString() {
		ReverseString hello = new ReverseString();
		String s = hello.reverseString("Hannah");
		assertEquals(s, "hannaH");
	}
	
	@Test 
	void testHelloChar(){
		ReverseString hello = new ReverseString();
		char[] sToRev = { 'H','e','l','l','o' }; 
		char[] s = hello.reverseCharArray(sToRev);
		String sToAssert = String.valueOf(s);
		assertEquals(sToAssert, "olleH");
	}
	
	@Test 
	void testHannahChar(){
		ReverseString hannah = new ReverseString();
		char[] sToRev = { 'H','a','n','n','a', 'h' }; 
		char[] s = hannah.reverseCharArray(sToRev);
		String sToAssert = String.valueOf(s);
		assertEquals(sToAssert, "hannaH");
	}

}
