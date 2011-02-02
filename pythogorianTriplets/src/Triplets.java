

/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/


public class Triplets { 

	public int getTheProductOftehPythogoriantriplet( int sumOfNumbers){
		int asquare,bsquare,csquare;
		int productOfNumbers = 0;
		for(int a = 1 ; a< sumOfNumbers; a++){
			for(int b =1; b<sumOfNumbers; b++){
				for(int c=1; c<sumOfNumbers; c++){

					asquare = a*a;
					bsquare =b*b;
					csquare = c*c;
					int sum = a+b+c;
					if((asquare +bsquare ==csquare)&&(sum ==sumOfNumbers)){
						productOfNumbers = a * b * c;
					}
				}
			}
		}
		return productOfNumbers;
	}


}
