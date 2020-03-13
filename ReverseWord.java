import java.util.Scanner;

public class ReverseWord {  //Exercise 6.10

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = in.nextLine();
		int i = 0;
		boolean first = true;
		while(i < word.length() - 1) {
			String last = word.substring(word.length() - 1);
			String front = word.substring(0,word.length() - 1);
			if (!first) {
				String frontBefore = front.substring(0,i);
				String frontAfter = front.substring(i);
				word = frontBefore + last + frontAfter;
			}
			else {
				word = last + front;
				first = false;
			}
			i++;
		}
	System.out.println(word);
	}

}
