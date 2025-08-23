package Dsa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.MinimumValueToGetPositiveStepByStepSum;

class MinimumValueToGetPositiveStepByStepSumTest {

	MinimumValueToGetPositiveStepByStepSum m;
	
	@BeforeEach
	void setup() {
		m = new MinimumValueToGetPositiveStepByStepSum();
	}
	
	@Test
	void givenNumsIsNull_whenMinStartValue_returZero() {
		assertEquals(1, m.minStartValue(null));
	}
	
	@Test
	void givenNumsIsEmpty_whenMinStartValue_returZero() {
		assertEquals(1, m.minStartValue(new int[0]));
	}
	
	@Test
	void givenNumsTest1_whenMinStartValue_returZero() {
		assertEquals(5, m.minStartValue(new int[] {-3, 2, -3, 4, 2}));
	}
	
	@Test
	void givenNumsTest2_whenMinStartValue_returZero() {
		assertEquals(1, m.minStartValue(new int[] {1, 2}));
	}
	
	@Test
	void givenNumsTest3_whenMinStartValue_returZero() {
		assertEquals(5, m.minStartValue(new int[] {1, -2, -3}));
	}
	
	@Test
	void givenNumsAllNegative_whenMinStartValue_returZero() {
		assertEquals(298, m.minStartValue(new int[] {-100, -99, -98}));
	}

	@Test
	void givenNumsAllPositive_whenMinStartValue_returZero() {
		assertEquals(1, m.minStartValue(new int[] {1, 2, 3, 4, 5}));
	}

}
