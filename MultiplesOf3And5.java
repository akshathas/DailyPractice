
public class MultiplesOf3And5 {
	
	public int getMultiplesOf3Or5(){
		int sumofthenumbers  =0 ;
		 for(int i =0 ; i<1000 ; i++){
			 System.out.println(" i "+i);
			 if(i % 3 == 0 || i % 5== 0){
				 sumofthenumbers = sumofthenumbers +i;
				 System.out.println("sumofthenumbers "+sumofthenumbers);
			 }
		 }
		return sumofthenumbers;
	}

}
