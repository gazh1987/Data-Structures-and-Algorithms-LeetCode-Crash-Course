package Dsa;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTests {

	ReverseString s = new ReverseString();
	
	@BeforeEach
	void setup() {
		s = new ReverseString();
	}
	
	
	@Test
	void givenStringHello_whenReversed_thenReturnOlleH() {
		assertEquals("olleH", s.reverseString("Hello"));
	}
	
	@Test
	void givenStringHannah_whenReversed_thenReturnHannaH() {
		assertEquals("hannaH", s.reverseString("Hannah"));
	}
	
	@Test
	void givenNullString_whenReversed_thenReturnNull() {
		assertEquals(null, s.reverseString(null));
	}
	
	@Test 
	void givenCharArrayHello_whenReversed_thenReturnOlleh(){
		char[] sToRev = { 'H','e','l','l','o' }; 
		char[] reversed = s.reverseCharArrayInPlace(sToRev);
		String sToAssert = String.valueOf(reversed);
		assertEquals("olleH", sToAssert);
	}
	
	@Test 
	void givenCharArrayHannah_whenReversed_thenReturnStringHannah(){
		char[] sToRev = { 'H','a','n','n','a', 'h' }; 
		char[] reversed = s.reverseCharArrayInPlace(sToRev);
		String sToAssert = String.valueOf(reversed);
		assertEquals("hannaH", sToAssert);
	}
	
	@Test 
	void givenEmptyCharArray_whenReversed_thenReturnsEmpty(){
		assertNull(s.reverseCharArrayInPlace(null));
	}
}
