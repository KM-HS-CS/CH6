import java.util.Scanner;

public class MinValue { //Exercise 6.7

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int minimum = 0;
		boolean first = true;
		while (in.hasNextInt()) {
			int n = in.nextInt();
			if (first) {
				minimum = n;
				first = false;
				System.out.println("First is " + minimum);
			}
			else if (n == 0) {
				System.out.println("Ending minimum is: " + minimum);
			}
			else if (n < minimum) {
				minimum = n;
				System.out.println("New minimum is " + minimum);
		}
			else {
				System.out.println("not lower " + n);
			}
	}
		System.out.println("minimum is: " + minimum);
}}
