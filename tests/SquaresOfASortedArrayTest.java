package Dsa.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.SquaresOfASortedArray;

class SquaresOfASortedArrayTest {

	SquaresOfASortedArray s;
	
	@BeforeEach
	void setup() {
		s = new SquaresOfASortedArray();
	}
	
	@Test
	void givenIntArrayNums_whenSortedAndSquared_returnSortedAndSquaredArray() {
		int[] nums = {-8, -4,-1,0,3,10};
		assertArrayEquals(s.sortedSquaredSort(nums), new int[]{0,1,9,16,64,100});
	}
	
	@Test
	void givenIntArrayNumsWithAllPositiveNums_whenSortedAndSquared_returnSortedAndSquaredArray() {
		int[] nums = {1, 2, 3, 4, 5};
		assertArrayEquals(s.sortedSquaredSort(nums), new int[]{1, 4, 9, 16, 25});
	}	
	
	@Test
	void givenIntArrayNumsWithAllNegativeNums_whenSortedAndSquared_returnSortedAndSquaredArray() {
		int[] nums = {-5, -4, -3, -2, -1};
		assertArrayEquals(s.sortedSquaredSort(nums), new int[]{1, 4, 9, 16, 25});
	}	
	
	@Test
	void givenIntArrayIsNull_whenSquared_returnEmptyIntArray() {
		int[] nums = null;
		assertArrayEquals(s.sortedSquaredSort(nums), new int [0]);
	}
	
	@Test
	void givenIntArrayIsEmpty_whenSquared_returnEmptyIntArray() {
		int[] nums = new int[] {};
		assertArrayEquals(s.sortedSquaredSort(nums), new int [0]);
	}
}
