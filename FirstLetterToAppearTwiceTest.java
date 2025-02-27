package Dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstLetterToAppearTwiceTest {

	FirstLetterToAppearTwice f; 
	
	@BeforeEach
	void setup() {
		f = new FirstLetterToAppearTwice();
	}
	
	@Test
	void givenInputIsNull_returnSpacedChar() {
		assertEquals('\0', f.repeatedCharacter(null));
	}
	
	@Test
	void givenInputIsNotNull_returnCharC() {
		assertEquals('c', f.repeatedCharacter("abccbaacz"));
	}
	
	@Test
	void givenInputIsNotNull_returnCharD() {
		assertEquals('d', f.repeatedCharacter("abcdd"));
	}
	
	@Test
	void givenNoDuplicateChar_returnSpacedChar() {
		assertEquals('\0', f.repeatedCharacter("abcdefghijk"));
	}

}
