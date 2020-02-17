package assignment4a;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseConstructionCostTest {

	@Test
	public void testCalculateConstructionCost() {
		HouseConstructionCost obj1=new HouseConstructionCost();
		assertEquals("Construction Cost of the house",1140750.0,obj1.CalculateConstructionCost("FullyAutomated",456.3),0);
	}

}
