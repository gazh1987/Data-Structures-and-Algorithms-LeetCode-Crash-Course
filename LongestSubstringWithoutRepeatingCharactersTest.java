package Dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {
	
	LongestSubstringWithoutRepeatingCharacters l;
	
	@BeforeEach
	void setUp() {
		l = new LongestSubstringWithoutRepeatingCharacters();
	}

	@Test
	void givenSubstring_returnLength_1() {
		assertEquals(3, l.lengthOfLongestSubstring("abcabcbb"));
	}
	
	@Test
	void givenSubstring_returnLength_2() {
		assertEquals(1, l.lengthOfLongestSubstring("bbbbb"));
	}
	
	@Test
	void givenSubstring_returnLength_3() {
		assertEquals(2, l.lengthOfLongestSubstring("aab"));
	}
	
	@Test
	void givenSubstring_returnLength_4() {
		assertEquals(3, l.lengthOfLongestSubstring("dvdf"));
	}
	
	@Test
	void givenSubstring_returnLength_5() {
		assertEquals(3, l.lengthOfLongestSubstring("pwwkew"));
	}
	
}
