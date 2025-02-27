package Dsa;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {

	TwoSum s;
	
	@BeforeEach
	void setup() {
		s = new TwoSum();
	}
	
	@Test
	void test1() {
		assertArrayEquals(new int[] {0,1}, s.twoSum(new int[] {2,7,11,15}, 9));
	}
	
	@Test
	void test2() {
		assertArrayEquals(new int[] {1,2}, s.twoSum(new int[] {3, 2, 4}, 6));
	}
	
	@Test
	void test3() {
		assertArrayEquals(new int[] {0,1}, s.twoSum(new int[] {3, 3}, 6));
	}
	
	

}
