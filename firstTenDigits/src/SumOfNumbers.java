import java.math.BigDecimal;
import java.math.BigInteger;


public class SumOfNumbers {
	String nbr[];
	public SumOfNumbers (String[] nbr){
		this.nbr = nbr;
	}
	public String getDigitsOfSum(int rangeOfNumber ,int digitsUpto)
	{  
		
		BigInteger number = BigInteger.ZERO;
		BigInteger sumOfNumber = BigInteger.ZERO;
		String digits = "";
		
		for(int i =0 ; i<rangeOfNumber; i++){
			try  
			{ 
				number = new BigInteger(nbr[i]);  
				sumOfNumber = sumOfNumber.add(number); 

			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("error"+e.getMessage());
			}
		}


		digits = sumOfNumber.toString().substring(0, digitsUpto);
         return digits;
		

	}
}