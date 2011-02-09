import junit.framework.TestCase;


public class NumberRangeTest extends TestCase {
   
	
	public void testShouldCheckThesumOfPrimenumbers(){
		assertEquals(142913828922l, new NumberRange().sumOfPrimeNumbers(2000000));
	}
}
