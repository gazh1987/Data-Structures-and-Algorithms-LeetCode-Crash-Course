package Dsa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.NumberOfWaysToSplitArray;

class NumberOfWaysToSplitArrayTest {

	NumberOfWaysToSplitArray n;
	
	@BeforeEach
	void setup() {
		n = new NumberOfWaysToSplitArray();
	}
	
	@Test
	void givenNumsIsEmpty_whenWaysToSplitArray_thenReturnZero() {
		assertEquals(0, n.waysToSplitArray(new int[0]));
	}
	
	@Test
	void givenNumsIsNull_whenWaysToSplitArray_thenReturnZero() {
		assertEquals(0, n.waysToSplitArray(null));
	}
	
	@Test
	void givenNumsLengthLtTwo_whenWaysToSplitArray_thenReturnZero() {
		assertEquals(0, n.waysToSplitArray(new int[] {2}));
	}
	
	@Test
	void givenNumsHasAllPositiveInts_whenWaysToSplitArray_thenReturnZero() {
		assertEquals(2, n.waysToSplitArray(new int[] {2, 3, 1, 0}));
	}
	
	@Test
	void givenNumsHasNegativeInts_whenWaysToSplitArray_thenReturnZero() {
		assertEquals(2, n.waysToSplitArray(new int[] {10, 4, -8, 7}));
	}
	
	@Test
	void givenNumsIsAllSameInts_whenWaysToSplitArray_thenReturnZero() {
		assertEquals(2, n.waysToSplitArray(new int[] {1, 1, 1, 1}));
	}
	
	@Test
	void givenNumsIsAllNegativeNumbersStartingAtZero_whenWaysToSplitArray_thenReturnZero() {
		assertEquals(4, n.waysToSplitArray(new int[] {0, -1, -2, -3, -4, -5}));
	}

}
