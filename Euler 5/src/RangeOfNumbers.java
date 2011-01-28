
public class RangeOfNumbers {
	public int getSmallestNumberDivisibleByAllNumberFromOne(int range){
		boolean divisible = false;
		int smallestNumber = 1;
		
		while(true){
		 divisible = true;
		for(int i =1 ; i  <= range; i++){
			if(smallestNumber % i !=0){
				divisible = false;
				break;
			}
		}
		if(divisible)
	    break;
		smallestNumber++ ;
		
	}
		System.out.println( " number "+smallestNumber);
		return smallestNumber;
	}

}
