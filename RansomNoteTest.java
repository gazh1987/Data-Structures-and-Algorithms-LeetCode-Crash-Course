package Dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RansomNoteTest {

	RansomNote r;
	
	@BeforeEach
	void setup() {
		r = new RansomNote();
	}
	
	@Test
	void givenEmptyStringInput_returnTrue() {
		assertTrue(r.canConstruct("", ""));
	}
	
	@Test
	void givenCannotBeConstructedSingleChar_returnFalse() {
		assertFalse(r.canConstruct("a", "b"));
	}
	
	@Test
	void givenCannotBeConstructedMultipleChar_returnFalse() {
		assertFalse(r.canConstruct("aa", "ab"));
	}
	
	@Test
	void givenCanBeConstructedMultipleChar_returnTrue() {
		assertTrue(r.canConstruct("aa", "aab"));
	}
	
	@Test
	void givenCanBeConstructedMultipleLongWithSpecialChars_returnTrue() {
		assertTrue(r.canConstruct("He is, a tiny man!", "Hello everyone, this is a magazine!"));
	}
}
