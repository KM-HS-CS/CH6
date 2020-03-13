import java.util.Random;

public class DiceSimulation {  //Programming 6.10

	public static void main(String[] args) {
		Random generator = new Random();
		
		// no sixes in four rolls simulation
		int no6Counter = 0;
		int got6Counter = 0;
		for (int i = 0; i < 1000000; i++) {
			int roll1 = generator.nextInt(6);
			int roll2 = generator.nextInt(6);
			int roll3 = generator.nextInt(6);
			int roll4 = generator.nextInt(6);
			if (roll1 != 0 && roll2 != 0 && roll3 != 0 && roll4 != 0) {
				no6Counter ++;
			}
			else {
				got6Counter ++;
			}
		}
		System.out.println("No Sixes: " + no6Counter);
		System.out.println("Got a Six: " + got6Counter);
		System.out.println();

		
		// no pairs of sixes in 24 rolls
		int noPairCounter = 0;
		int pairCounter = 0;
		for (int i = 0; i < 1000000; i++) {
			for (int j = 0; j <= 24; j++) {
				int die1 = generator.nextInt(6);
				int die2 = generator.nextInt(6);
				if (j == 24) {
					noPairCounter++;
					break;
				}
				else if (die1 == 0 && die2 == 0) {
					pairCounter++;
					break;
				}
			}
		}
		System.out.println("No Pairs: " + noPairCounter);
		System.out.println("Got a Pair: " + pairCounter);
	}

}
