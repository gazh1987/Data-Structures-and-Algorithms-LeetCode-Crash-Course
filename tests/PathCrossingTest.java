package Dsa.tests;
import Dsa.PathCrossing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PathCrossingTest {

	PathCrossing p;
	
	@BeforeEach
	void setUp() {
		p = new PathCrossing();
	}

	@Test
	void test1() {
		assertFalse(p.isPathCrossing("NES"));
	}
	
	@Test
	void test2() {
		assertTrue(p.isPathCrossing("NESWW"));
	}
	
	@Test
	void test3() {
		assertTrue(p.isPathCrossing("NNSWWEWSSESSWENNW"));
	}
	
	@Test
	void test4() {
		assertFalse(p.isPathCrossing("SSSWNNWNENNNWWNNNENNNNNWNNNNWNWSWWWSWWWNWSWSW"));
	}
}
