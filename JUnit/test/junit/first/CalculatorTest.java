package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		assertEquals("Result", 5, cal.add(2, 3));
	}

	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		assertEquals("Result", 20, cal.sub(100, 80));
	}

}
