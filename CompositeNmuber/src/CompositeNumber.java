
public class CompositeNumber {

	private long compositeNmuber;
	public CompositeNumber(long compositeNumber)
	{
		this.compositeNmuber = compositeNumber;
		
	}
	
	public long getThelargestPrimeNumber(){
		int primefactor = 0;
		//boolean isNotPrime = false;
		
		for(int i =2 ; i<= compositeNmuber; i++){
			if(compositeNmuber % i == 0){
				compositeNmuber = compositeNmuber / i;
				primefactor = i;
				i--;
			}
		}
		return primefactor;
	}
	
	}
