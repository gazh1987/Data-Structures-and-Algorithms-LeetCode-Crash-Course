package Dsa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.ArraySubstrings;

class ArraySubstringsTest {

	ArraySubstrings s;
	
	@BeforeEach
	void setup() {
		s = new ArraySubstrings();
	}
	
	@Test
	void givenEmptyArray_whenSubstringAveraged_ReturnZero() {
		assertEquals(0, s.findMaxAverage(new int[0], 0), 0.0);
	}
	
	@Test
	void givenArray_whenSubstringAveraged_Return12_75000() {
		assertEquals(12.75000, s.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4), 0.0);
	}
	
	@Test
	void givenArrayWithOneElement_whenSubstringAveraged_Return5_00000() {
		assertEquals(5.00000, s.findMaxAverage(new int[] {5}, 1), 0.0);
	}
	
	@Test
	void givenArrayAllPositive_whenSubstringAveraged_Return12_75000() {
		assertEquals(6.0, s.findMaxAverage(new int[] {1,  2, 3, 4, 5, 6, 7}, 3), 0.0);
	}

}
