package Dsa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.SumOfSumArray;

class SumOfSumArrayTest {

	SumOfSumArray s;
	
	@BeforeEach
	void setup() {
		s = new SumOfSumArray();
	}
	
	/**
	 * sumOfSubArray Tests
	 */
	
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
	
	
	/**
	 * answerQueries Tests
	 */
	
	@Test
	void givenNumsIsNull_whenAnsweringQueries_thenFalse() {
		assertArrayEquals(new boolean[0], 
				s.answerQueries(null, 
				new int[][] {{0, 3}, {2, 5}, {2, 4}}, 13));
	}
	
	@Test
	void givenNumsLengthIsZero_whenAnsweringQueries_thenTrueFalseTrue() {
		assertArrayEquals(new boolean[0], 
				s.answerQueries(new int[0], 
				new int[][] {{0, 3}, {2, 5}, {2, 4}}, 13));
	}
	
	@Test
	void givenQueriesIsNull_whenAnsweringQueries_thenFalse() {
		assertArrayEquals(new boolean[0], 
				s.answerQueries(new int[] {1, 6, 3, 2, 7, 2}, 
				null, 13));
	}
	
	@Test
	void givenQueriesLengthIsZero_whenAnsweringQueries_thenTrueFalseTrue() {
		assertArrayEquals(new boolean[0], 
				s.answerQueries(new int[] {1, 6, 3, 2, 7, 2}, 
				new int[0][0], 13));
	}
	
	@Test
	void givenArrayOfQueries_whenAnsweringQueries_thenTrueFalseTrue() {
		assertArrayEquals(new boolean[] {true, false, true}, 
				s.answerQueries(new int[] {1, 6, 3, 2, 7, 2}, 
				new int[][] {{0, 3}, {2, 5}, {2, 4}}, 13));
	}
	
	@Test
	void givenStartIndexLtZero_whenAnsweringQueries_thenFalseFalseTrue() {
		assertArrayEquals(new boolean[] {false, false, true}, 
				s.answerQueries(new int[] {1, 6, 3, 2, 7, 2}, 
				new int[][] {{-1, 3}, {2, 5}, {2, 4}}, 13));
	}
	
	@Test
	void givenFinishIndexGtPrefixLength_whenAnsweringQueries_thenFalseFalseTrue() {
		assertArrayEquals(new boolean[] {false, false, true}, 
				s.answerQueries(new int[] {1, 6, 3, 2, 7, 2}, 
				new int[][] {{1, 10}, {2, 5}, {2, 4}}, 13));
	}
	
	@Test
	void givenStartIndexGtFinishIndex_whenAnsweringQueries_thenFalseFalseTrue() {
		assertArrayEquals(new boolean[] {false, false, false}, 
				s.answerQueries(new int[] {1, 6, 3, 2, 7, 2}, 
				new int[][] {{2, 1}, {2, 5}, {5, 4}}, 13));
	}
}
