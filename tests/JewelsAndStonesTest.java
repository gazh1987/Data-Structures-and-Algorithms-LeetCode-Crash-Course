package Dsa.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dsa.JewelsAndStones;

class JewelsAndStonesTest {
	
	JewelsAndStones j;
	
	@BeforeEach
	void setup() {
		j = new JewelsAndStones();
	}

	@Test
	void givenStonesAreJewels_ReturnAmount() {
		assertEquals(3, j.numJewelsInStones("aA", "aAAbbbb"));
	}
	
	@Test
	void givenNoStonesAreJewels_ReturnAmount() {
		assertEquals(0, j.numJewelsInStones("z", "ZZ"));
	}

}
