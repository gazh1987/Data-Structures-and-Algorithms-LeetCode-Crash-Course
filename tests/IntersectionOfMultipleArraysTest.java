package Dsa.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.IntersectionOfMultipleArrays;

class IntersectionOfMultipleArraysTest {

	IntersectionOfMultipleArrays i;
	
	@BeforeEach
	void setUp() throws Exception {
		i = new IntersectionOfMultipleArrays();
	}

	@Test
	void givenNumbersExistInAllArrays_returnIntersectedNumbers_Test1() {
		int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
		List<Integer> expected = new ArrayList<>();
		expected.add(3);
		expected.add(4);
		assertEquals(expected, i.intersection(nums));
	}
	
	@Test
	void givenNumbersExistInAllArrays_returnIntersectedNumbers_Test2() {
		int[][] nums = {{7,34,45,10,12,27,13},{27,21,45,10,12,13}};
		List<Integer> expected = new ArrayList<>();
		expected.add(10);
		expected.add(12);
		expected.add(13);
		expected.add(27);
		expected.add(45);
		assertEquals(expected, i.intersection(nums));
	}
	
	@Test
	void givenNumbersDoNotExistInAllArrays_returnEmptyList() {
		int[][] nums = {{1, 2, 3}, {4, 5, 6}};
		List<Integer> expected = new ArrayList<>();
		assertEquals(expected, i.intersection(nums));
	}
	
	@Test
	void givenNumsIsNull_returnEmptyList() {
		List<Integer> expected = new ArrayList<>();
		assertEquals(expected, i.intersection(null));
	}
	
	@Test
	void givenNumsIsEmpty_returnEmptyList() {
		List<Integer> expected = new ArrayList<>();
		assertEquals(expected, i.intersection(new int[0][0]));
	}

}
