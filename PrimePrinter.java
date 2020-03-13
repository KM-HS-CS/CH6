import java.util.*;

public class PrimePrinter {

	public static void main(String[] args) { //Programming 6.5
		
		PrimeGenerator test = new PrimeGenerator();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the limit number: ");
		int max = in.nextInt();
		for (int i = 2; i <= max; i ++) {
			if (test.isPrime(i)) {
				System.out.println(i);
			}
		} 

	}

}
