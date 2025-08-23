package Dsa.tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.MissingNumber;

class MissingNumberTest {

	MissingNumber m;
	
	@BeforeEach
	void setup() {
		m = new MissingNumber();
	}
	
	@Test
	void givenNumsIsNull_thenThrowIllegalArgumentException() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			m.missingNumber(null);
		});
		
		assertEquals("Nums Array Length must have more than 1 element", exception.getMessage());
	}
	
	@Test
	void givenNumsLengthLt2_thenThrowIllegalArgumentException() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			m.missingNumber(new int[] {1});
		});
		
		assertEquals("Nums Array Length must have more than 1 element", exception.getMessage());
	}
	
	@Test
	void givenNumsLengthIs3_thenReturn2() {
		assertEquals(2, m.missingNumber(new int[] {3, 0, 1}));
	}
	
	@Test
	void givenNumsLengthIs2_thenReturn2() {
		assertEquals(2, m.missingNumber(new int[] {0, 1}));
	}
	
	@Test
	void givenNumsLengthIs9_thenReturn8() {
		assertEquals(8, m.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	
	@Test
	void givenNumsLengthIs3_whenMissingNumsFast_thenReturn2() {
		assertEquals(2, m.missingNumberFast(new int[] {3, 0, 1}));
	}
	
	@Test
	void givenNumsLengthIs2_whenMissingNumsFast_thenReturn2() {
		assertEquals(2, m.missingNumberFast(new int[] {0, 1}));
	}
	
	@Test
	void givenNumsLengthIs9_whenMissingNumsFast_thenReturn8() {
		assertEquals(8, m.missingNumberFast(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	
}
