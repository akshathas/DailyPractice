import junit.framework.TestCase;


public class MultiplesOf3And5Test extends TestCase{

	
	public void ShouldCheckForSumofMultiplesof3Or5(){
		MultiplesOf3And5 multiplesOf3And5 = new MultiplesOf3And5();
		assertEquals(233168, multiplesOf3And5.getMultiplesOf3Or5());
	}
}
