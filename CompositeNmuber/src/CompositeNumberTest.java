import junit.framework.TestCase;


public class CompositeNumberTest extends TestCase {
	
	public void shouldCheckTheLargestPrimefactor(){
		assertEquals(5, new CompositeNumber(25).getThelargestPrimeNumber());
		  assertEquals(6857, new CompositeNumber(600851475143L).getThelargestPrimeNumber());
		
	}

}
