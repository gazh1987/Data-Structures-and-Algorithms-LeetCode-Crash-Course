package Dsa;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquaresOfASortedArrayTest {

	@Test
	void test1() {
		SquaresOfASortedArray s = new SquaresOfASortedArray();
		int[] nums = {-4,-1,0,3,10};
		int[] numsSorted =  s.sortedSquaresBubble(nums);
		assertArrayEquals(numsSorted, new int[]{0,1,9,16,100});
	}
	
	@Test
	void test2() {
		SquaresOfASortedArray s = new SquaresOfASortedArray();
		int[] nums = {-7,-3,2,3,11};
		int[] numsSorted =  s.sortedSquaresBubble(nums);
		assertArrayEquals(numsSorted, new int[]{4,9,9,49,121});
	}
	
	@Test
	void test3() {
		SquaresOfASortedArray s = new SquaresOfASortedArray();
		int[] nums = {-4,-4,-3};
		int[] numsSorted =  s.sortedSquaresBubble(nums);
		assertArrayEquals(numsSorted, new int[]{9, 16, 16});
	}
	
	@Test
	void test4() {
		SquaresOfASortedArray s = new SquaresOfASortedArray();
		int[] nums = {-4,-1,0,3,10};
		int[] numsSorted =  s.sortedSquaresOn(nums);
		assertArrayEquals(numsSorted, new int[]{0,1,9,16,100});
	}
	
	@Test
	void test5() {
		SquaresOfASortedArray s = new SquaresOfASortedArray();
		int[] nums = {-7,-3,2,3,11};
		int[] numsSorted =  s.sortedSquaresOn(nums);
		assertArrayEquals(numsSorted, new int[]{4,9,9,49,121});
	}
	
	@Test
	void test6() {
		SquaresOfASortedArray s = new SquaresOfASortedArray();
		int[] nums = {-4,-4,-3};
		int[] numsSorted =  s.sortedSquaresOn(nums);
		assertArrayEquals(numsSorted, new int[]{9, 16, 16});

	}
		
	
}
