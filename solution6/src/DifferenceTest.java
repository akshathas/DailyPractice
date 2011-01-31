import junit.framework.TestCase;


public class DifferenceTest extends TestCase {
	
	public void testShouldCheckTheDifference(){
		assertEquals(25164150, new Difference().differenceOfSumOfSquaresandSquareOfSums(100));
	}

}
