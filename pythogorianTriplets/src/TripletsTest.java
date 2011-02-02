import junit.framework.TestCase;


public class TripletsTest extends TestCase {

	public void testShouldCheckTheproductOfthePythogorianTriplet(){
		assertEquals(31875000, new Triplets().getTheProductOftehPythogoriantriplet(1000));
	}
}
