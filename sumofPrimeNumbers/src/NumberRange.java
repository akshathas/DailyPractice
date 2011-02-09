


public class NumberRange {


	public long sumOfPrimeNumbers(int range){
		boolean isnotPrime = false;
		long sumOfNumbers = 0;
		for(int i = 2 ;i<=range; i++){
			isnotPrime = checkPrimeNumber(isnotPrime, i);if(!isnotPrime){
				sumOfNumbers +=i;

			}else{
				isnotPrime = false;
			}

		}
		System.out.println(sumOfNumbers);
		return sumOfNumbers;
	}

	private boolean checkPrimeNumber(boolean isnotPrime, int i) {
		for(int j =2 ; j<i ; j++){
			if(i % j == 0){
				isnotPrime = true;
				break;

			}
		}
		return isnotPrime;
	}
}