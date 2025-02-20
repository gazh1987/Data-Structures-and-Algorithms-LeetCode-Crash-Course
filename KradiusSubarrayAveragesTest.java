package Dsa;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KradiusSubarrayAveragesTest {

	KradiusSubarrayAverages k;
	
	@BeforeEach
	void setup() {
		k = new KradiusSubarrayAverages();
	}
	
	@Test
	void whenNumsIsNull_whenGetAverages_thenNewEmptyIntArray() {
		assertArrayEquals(new int[0], k.getAverages(null, 0));
	}
	
	@Test
	void whenNumsIsEmpty_whenGetAverages_thenNewEmptyIntArray() {
		assertArrayEquals(new int[0], k.getAverages(new int[0], 0));
	}
	
	@Test
	void whenNums_whenGetAverages_thenReturnAveragedArray() {
		assertArrayEquals(new int[] {-1,-1,-1,5,4,4,-1,-1,-1}, k.getAverages(new int[] {7,4,3,9,1,8,5,2,6}, 3));
	}
	
	@Test
	void whenNumsLengthIsOne_whenGetAverages_thenReturnAveragedArray() {
		assertArrayEquals(new int[] {10000}, k.getAverages(new int[] {10000}, 0));
	}
	
	@Test
	void whenKGtNumsLength_whenGetAverages_thenReturnAveragedArray() {
		assertArrayEquals(new int[] {-1}, k.getAverages(new int[] {10000}, 8));
	}
	
	@Test
	void whenKEqualNumsLength_whenGetAverages_thenReturnAveragedArray() {
		assertArrayEquals(new int[] {-1}, k.getAverages(new int[] {10000}, 1));
	}
}
