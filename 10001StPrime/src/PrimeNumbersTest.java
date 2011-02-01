import junit.framework.TestCase;


public class PrimeNumbersTest extends TestCase {

	public void testShouldChecktherequiredPrimeNumber(){
		assertEquals(104743, new PrimeNumbers().getTheRequiredPrimeNumber(10001));
	}
}
