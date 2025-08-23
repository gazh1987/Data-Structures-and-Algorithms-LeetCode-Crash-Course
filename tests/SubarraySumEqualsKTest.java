package Dsa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.SubarraySumEqualsK;

class SubarraySumEqualsKTest {

	SubarraySumEqualsK s;
	
	@BeforeEach
	void setUp() {
		s = new SubarraySumEqualsK();
	}

	@Test
	void givenNumsIsNull_returnZero() {
		assertEquals(0, s.subarraySum(null, 0));
	}
	
	@Test
	void givenNumsIsEmpty_returnZero() {
		assertEquals(0, s.subarraySum(new int[0], 0));
	}
	
	@Test
	void givenSubarraySumEqualsK_returnNumOfSubarrays_Test1() {
		assertEquals(2, s.subarraySum(new int[] {1, 1, 1}, 2));
	}
	
	@Test
	void givenSubarraySumEqualsK_returnNumOfSubarrays_Test2() {
		assertEquals(2, s.subarraySum(new int[] {1, 2, 3}, 3));
	}
	
	@Test
	void givenNoSubarrayEqK_returnZero_Test2() {
		assertEquals(0, s.subarraySum(new int[] {1, 2, 3}, 100));
	}
	
	@Test
	void givenNumsHasNegativeNums_returnNumOfSubarrays() {
		assertEquals(6, s.subarraySum(new int[] {1, -1, 1, -1, 1, -1}, 1));
	}
	
	@Test
	void givenkIsZero_returnZero() {
		assertEquals(0, s.subarraySum(new int[] {1}, 0));
	}
}
