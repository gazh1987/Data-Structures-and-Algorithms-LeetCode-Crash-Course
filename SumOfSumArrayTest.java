package Dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumOfSumArrayTest {

	SumOfSumArray s;
	
	@BeforeEach
	void setup() {
		s = new SumOfSumArray();
	}
	
	@Test
	void givenNumsIsEmpty_whenFindingSumOfSubArray_thenReturnZero() {
		assertEquals(0, s.sumOfSubArray(new int[0], 0, 0));
	}
	
	@Test
	void givenNumsIsNull_whenFindingSumOfSubArray_thenReturnZero() {
		assertEquals(0, s.sumOfSubArray(null, 0, 0));
	}
	
	@Test
	void givenStartIndexLtZero_whenFindingSumOfSubArray_thenReturnZero() {
		assertEquals(0, s.sumOfSubArray(new int[] {1, 2, 3, 4, 5}, -1, 0));
	}
	
	@Test
	void givenStartIndexGtFinishIndex_whenFindingSumOfSubArray_thenReturnZero() {
		assertEquals(0, s.sumOfSubArray(new int[] {1, 2, 3, 4, 5}, 3, 2));
	}
	
	@Test
	void givenFinishIndexGtNumsLength_whenFindingSumOfSubArray_thenReturnZero() {
		assertEquals(0, s.sumOfSubArray(new int[] {1, 2, 3, 4, 5}, 2, 10));
	}
	
	@Test
	void givenNumsLengthIsOne_whenFindingSumOfSubArray_thenReturnArrayIndexAtZero() {
		assertEquals(5, s.sumOfSubArray(new int[] {5}, 0, 0));
	}
	
	@Test
	void givenNumsArray_whenFindingSumOfSubArray_thenSumOfSubArray() {
		assertEquals(14, s.sumOfSubArray(new int[]{3, 6, 2, 8, 1, 4, 1, 5}, 3, 6));
	}
	
	@Test
	void givenStartIndexIsZero_whenFindingSumOfSubArray_thenSumOfSubArray() {
		assertEquals(25, s.sumOfSubArray(new int[]{3, 6, 2, 8, 1, 4, 1, 5}, 0, 6));
	}
}
