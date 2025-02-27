package Dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckIfTheSentenceIsPangramTest {

	CheckIfTheSentenceIsPangram p;
	
	@BeforeEach
	void setup() {
		p = new CheckIfTheSentenceIsPangram();
	}
	
	@Test
	void givenInputIsNull_thenReturnFalse() {
		assertFalse(p.checkIfPangram(null));
	}
	
	@Test
	void givenInputIsEmpty_thenReturnFalse() {
		assertFalse(p.checkIfPangram(""));
	}
	
	@Test
	void givenInputIsPangram_thenReturnTrue() {
		assertTrue(p.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
	
	@Test
	void givenInputIsNotPangram_thenReturnFalse() {
		assertFalse(p.checkIfPangram("leetcode"));
	}

}
