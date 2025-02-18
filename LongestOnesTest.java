package Dsa;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestOnesTest {

	LongestOnes l;
	
	@BeforeEach
	void setup() {
		l = new LongestOnes();
	}
	
	@Test
	void givenNumsIsEmpty_whenFindingLongestOnes_return0() {
		assertEquals(0, l.longestOnes(new int[0], 0));
	}
	
	@Test
	void givenNumsAndKIs2_whenFindingLongestOnes_return6() {
		assertEquals(6, l.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
	}
	
	@Test
	void givenNumsAndKIs3_whenFindingLongestOnes_return10() {
		assertEquals(10, l.longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
	}
	
	@Test
	void givenNumsIsAllOnes_whenFindingLongestOnes_return6() {
		assertEquals(6, l.longestOnes(new int[] {1, 1, 1, 1, 1, 1}, 1));
	}
	
	@Test
	void givenKGreaterThanNumsLength_whenFindingLongestOnes_returnNumsLength() {
		assertEquals(11, l.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 12));
	}
	
	@Test
	void givenNumsIsAllZeros_whenFindingLongestOnes_returnK() {
	    assertEquals(3, l.longestOnes(new int[] {0,0,0,0,0}, 3));
	}
	
	@Test
	void givenKIsZero_whenFindingLongestOnes_returnLongestConsecutiveOnes() {
	    assertEquals(3, l.longestOnes(new int[] {1,1,0,1,1,1,0,1}, 0));
	}

}
