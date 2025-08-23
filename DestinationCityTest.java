package Dsa;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DestinationCityTest {
	
	DestinationCity d;
	
	@BeforeEach
	void setUp() {
		d = new DestinationCity();
	}

	@Test
	void test1() {
		List<List<String>> path = Arrays.asList(
			Arrays.asList("London","New York"),
			Arrays.asList("New York","Lima"),
			Arrays.asList("Lima","Sao Paulo")
		);
				
		assertEquals(d.destCity(path), "Sao Paulo");
	}
	
	@Test
	void test2() {
		List<List<String>> path = Arrays.asList(
			Arrays.asList("B","C"),
			Arrays.asList("D","B"),
			Arrays.asList("C","A")
		);
				
		assertEquals(d.destCity(path), "A");
	}
	
	@Test
	void test3() {
		List<List<String>> path = Arrays.asList(
			Arrays.asList("A","Z")
		);
				
		assertEquals(d.destCity(path), "Z");
	}
	
	@Test
	void test4() {
		List<List<String>> path = Arrays.asList(
			Arrays.asList("Lima","Sao Paulo"),
			Arrays.asList("London","New York"),
			Arrays.asList("New York","Lima")
		);
				
		assertEquals(d.destCity(path), "Sao Paulo");
	}

}
