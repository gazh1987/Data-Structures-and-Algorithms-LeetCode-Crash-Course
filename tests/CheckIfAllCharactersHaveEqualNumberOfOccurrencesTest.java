package Dsa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.CheckIfAllCharactersHaveEqualNumberOfOccurrences;

class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {
	
	CheckIfAllCharactersHaveEqualNumberOfOccurrences c;
	
	@BeforeEach
	void setUp() {
		c = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();
	}

	@Test
	void givenStringIsNull_returnFalse() {
		assertFalse(c.areOccurrencesEqual(null));
	}
	
	@Test
	void givenStringIsEmpty_returnTrue() {
		assertTrue(c.areOccurrencesEqual(""));
	}
	
	@Test
	void givenStringLengthIsOne_returnTrue() {
		assertTrue(c.areOccurrencesEqual("l"));
	}
	
	@Test
	void givenOccurrencesAreEqual_returnTrue() {
		assertTrue(c.areOccurrencesEqual("abacbc"));
	}
	
	@Test
	void givenOccurrencesArNotEqual_returnFalse() {
		assertFalse(c.areOccurrencesEqual("aaabb"));
	}
	
	@Test
	void givenAllCharactersAreTheSame_returnTrue() {
		assertTrue(c.areOccurrencesEqual("aaaaaaaaa"));
	}

}
