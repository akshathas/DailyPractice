
public class Difference {
	
	
	public int differenceOfSumOfSquaresandSquareOfSums(int range){
		int sumOfsquares = 0;
		int squareOfsums =  0;
		 int sumOfNumbers = 0;
		 int difference = 0;
		for(int i =0 ; i<=range ; i++){
			sumOfNumbers += i;
	        sumOfsquares +=(i*i);
	        
		}
		squareOfsums = sumOfNumbers*sumOfNumbers;
	    difference = squareOfsums - sumOfsquares;
	   return difference;
	    
	}

}
