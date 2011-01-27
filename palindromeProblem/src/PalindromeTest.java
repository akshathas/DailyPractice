import junit.framework.TestCase;


public class PalindromeTest extends TestCase {

	public void shouldGetTheLargestPalindrome(){
		assertEquals(906609, new Palindrome().getLargestPalindrome(99, 999));
	}
}
