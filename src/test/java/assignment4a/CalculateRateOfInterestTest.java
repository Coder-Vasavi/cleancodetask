package assignment4a;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateRateOfInterestTest {

	@Test
	public void testCalculateSimpleInterest() {
		CalculateRateOfInterest obj1=new CalculateRateOfInterest();
		assertEquals("Simple Interest is :",25000.0,obj1.CalculateSimpleInterest(50000,10,5),0);
	}

	@Test
	public void testCalculateCompoundInterest() {
		CalculateRateOfInterest obj2=new CalculateRateOfInterest();
		assertEquals("Compound Interest is :",30525.50000000003,obj2.CalculateCompoundInterest(50000,10,5),0);
	}

}
