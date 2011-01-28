import junit.framework.TestCase;


public class RangeOfNumbersTest extends TestCase {
	
	public void shouldTestTheSmallestNumberDivisibleByAllTheNumbers(){
		assertEquals(232792560, new RangeOfNumbers().getSmallestNumberDivisibleByAllNumberFromOne(20));
	}

}