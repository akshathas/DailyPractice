
public class Palindrome {
  
	
	public int getLargestPalindrome(int lowerLimit , int upperLimit){
		
		int product = 0;
		int finalPalindrome =0;
		for(int i=upperLimit; i > lowerLimit; i--){
			for(int j = upperLimit ; j>lowerLimit;  j--){
				product = j*i;
				if(isPalindrome(Integer.toString(product))){
					product = j*i;
					if(finalPalindrome < product){
						finalPalindrome = product;
					}
				}

				
			}
		}
		return finalPalindrome;
		
	}

	private static boolean isPalindrome(String product) {
		// TODO Auto-generated method stub

		char[]  productArray = product.toCharArray();
		int lenght = productArray.length;
		int halfLength = lenght/2;
		 for(int i =0 ; i<halfLength; i++){
			 if(productArray[i]!= productArray[lenght-1-i]){
				 return false;
			 }
		 }
		
		return true;
	}
}
