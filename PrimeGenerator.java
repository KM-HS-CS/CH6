
public class PrimeGenerator { //Programming 6.5
	
	public PrimeGenerator() {
		
	}
	
	public boolean isPrime(int number) {
		int factor = number - 1;
		boolean prime = true;
		while (factor >= Math.sqrt(number)) {
			if (number %  factor == 0) {
				prime = false;
				factor --;
			}
			else {
				factor --;
			}
		}
		return prime;
	}

	
	public int nextPrime(int number) 
	{
		boolean primeReached = false;
		number ++;
		while (!primeReached) 
		{
			for (int i = 2; i <= number; i ++) 
			{
				if (i == number) 
				{
					primeReached = true;
				}
				else if (number % i == 0) 
				{
					number ++;
					break;
				}
			}
		}
		return number;
			
				
	}
}
	


