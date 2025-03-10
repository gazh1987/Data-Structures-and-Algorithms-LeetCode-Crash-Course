package Dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountingElementsTest {

	CountingElements c;
	
	@BeforeEach
	void setup() {
		c = new CountingElements();
	}
	
	@Test
	void givenInputIsNull_thenThrowIllegalArgumentException() {
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () ->{
			c.countElements(null);
		});
		assertEquals("Input Array can not be null", exc.getMessage());
		
	}
	
	@Test
	void givenInputLt2_thenReturnZero() {
		assertEquals(0, c.countElements(new int[] {1}));
	}
	
	@Test
	void givenInputHasElementsToCount_thenReturnTwo() {
		assertEquals(2, c.countElements(new int[] {1,2,3}));
	}
	
	@Test
	void givenInputDoesNotHaveElementsToCount_thenReturnZero() {
		assertEquals(0, c.countElements(new int[] {1,1,3,3,5,5,7,7}));
	}

}
