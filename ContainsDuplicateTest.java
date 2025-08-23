package Dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {
	
	ContainsDuplicate c;

	@BeforeEach
	void setUp() {
		c = new ContainsDuplicate();
	}

	@Test
	void givenDuplicate_returnTrue1() {
		assertTrue(c.containsDuplicate(new int[] {1,2,3,1}));
	}
	
	@Test
	void givenAllUnique_returnFalse() {
		assertFalse(c.containsDuplicate(new int[] {1,2,3,4}));
	}
	
	@Test
	void givenDuplicate_returnTrue2() {
		assertTrue(c.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}

}
