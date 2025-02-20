package Dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunningSumOf1dArrayTest {

	RunningSumOf1dArray r;
	
	@BeforeEach
	void setup() {
		r = new RunningSumOf1dArray();
	}
	
	@Test
	void givenNumsIsNull_whenRunningSum_returnEmptyArray() {
		assertEquals(null, r.runningSum(null));
	}
	
	@Test
	void givenNumsIsEmpty_whenRunningSum_returnEmptyArray() {
		assertArrayEquals(new int[0], r.runningSum(new int[0]));
	}
	
	@Test
	void givenNumsLengthIsOne_whenRunningSum_returnNumsArray() {
		assertArrayEquals(new int[] {5}, r.runningSum(new int[] {5}));
	}
	
	@Test
	void givenNumsArray_whenRunningSum_returnSumOfNumsArray() {
		int[] nums = {1, 2, 3, 4};
		assertArrayEquals(new int[] {1, 3, 6, 10}, r.runningSum(nums));
	}

}
