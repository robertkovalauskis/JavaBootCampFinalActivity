package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15, (theCalculator.sum(5, 10)));
		assertEquals(15, (theCalculator.sum(10, 5)));
	}

	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.sum(-5, 10)));
		assertEquals(-5, (theCalculator.sum(5, -10)));
	}
	
	@Test
	public void testSubstract() {
		assertEquals(-5, (theCalculator.substract(5, 10)));
		assertEquals(5, (theCalculator.substract(10, 5)));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(50, (theCalculator.multiply(5, 10)));
		assertEquals(50, (theCalculator.multiply(10, 5)));
	}
	
	@Test
	public void testDivide() {
		assertEquals(5, (theCalculator.divide(50, 10)));
		assertEquals(2, (theCalculator.divide(10, 5)));
	}
	
	

}

