package firstTest;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestCalculator {
	
	Calculator calc= new Calculator();

	@Test
	public void testPowerZero() {
		int inputBase=0;
		int exp=0;
		int expectedValue=0;
		int actualValue=calc.power(0,0);
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void testPower() {
		int inputBase=2;
		int exp=3;
		int expectedValue=8;
		int actualValue= calc.power(inputBase, exp);
		assertTrue(expectedValue==actualValue);
		//fail("Not yet implemented");
	}

}


