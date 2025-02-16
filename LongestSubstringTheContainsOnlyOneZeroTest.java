package Dsa;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringTheContainsOnlyOneZeroTest {

	LongestSubstring l;
	
	@BeforeEach
	void setup() {
		l = new LongestSubstring();
	}
	
	
	@Test
	void GivenEmptyArray_WhenLongestSubstringThatCotainsOneZero_ReturnZero() {
		assertEquals(0, l.longestSubstringThatContainsOneZero(new int [0]));
	}
	
	@Test
	void GivenArray_WhenLongestSubstringThatCotainsOneZero_Return5() {
		assertEquals(5, l.longestSubstringThatContainsOneZero(new int []{1,1,0,1,1,0,0,1,1,0}));
	}

	@Test
	void GivenArrayWithAllOnes_WhenLongestSubstringThatCotainsOneZero_Return10() {
		assertEquals(10, l.longestSubstringThatContainsOneZero(new int []{1,1,1,1,1,1,1,1,1,1}));
	}
	
	@Test
	void GivenArrayWithAllZeros_WhenLongestSubstringThatCotainsOneZero_Return1() {
		assertEquals(1, l.longestSubstringThatContainsOneZero(new int []{0,0,0,0,0,0,0,0,0,0}));
	}
}
