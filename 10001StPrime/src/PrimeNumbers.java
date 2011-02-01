
public class PrimeNumbers {

	public int getTheRequiredPrimeNumber( int countOfNumbers){
		int count = 0;
		int number = 0;
		int primeNumber = 0;
		int range = 10000000;
		boolean isNotPrime = false;

		for(int i =2 ; i<range ; i++){
			isNotPrime = checkIfPrime(isNotPrime, i);
			if(!isNotPrime){
				number =i;
				count+= 1;

			}isNotPrime = false;
			if(count == countOfNumbers){
				primeNumber = number;
				break;

			}
		}
		return primeNumber;
	}





	private static boolean checkIfPrime(boolean flag, int i) {
		for(int j =2 ; j< i ; j++){
			if(i%j == 0)
				flag =true;


		}
		return flag;
	}
}
