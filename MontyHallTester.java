import java.util.Random;

public class MontyHallTester { //Exercise 6.22

	public static void main(String[] args) {
		Random generator = new Random();
		
		int carCounterSwitch = 0;
		int goatCounterSwitch = 0;
		int carCounterStay = 0;
		int goatCounterStay = 0;
		
		for(int i = 0; i < 1000; i ++) {
			int doorWithCar = generator.nextInt(3);
			int doorRemoved;
			
			//chooses which door to remove
			if (doorWithCar == 0) {		
				doorRemoved = generator.nextInt(2) + 1;
			}
			else if (doorWithCar == 1) {
				doorRemoved = 2;
			}
			else {
				doorRemoved = 1;
			}
			
			//counts result if you stay
			if (doorWithCar == 0) {
				carCounterStay ++;
			}
			else {
				goatCounterStay ++;
			}
			
			//counts result if you switch
			if (doorRemoved == 1) {
				if (doorWithCar == 2) {
					carCounterSwitch ++;
				}
				else {
					goatCounterSwitch ++;
				}
			}
			if (doorRemoved == 2) {
				if (doorWithCar == 1) {
					carCounterSwitch ++;
				}
				else {
					goatCounterSwitch ++;
				}
			}
			
			
		}
		System.out.println("Car wins when switched: " + carCounterSwitch);
		System.out.println("Goat loses when switched: " + goatCounterSwitch);
		System.out.println("Car wins when stayed: " + carCounterStay);
		System.out.println("Goat loses when stayed: " + goatCounterStay);
	}

}
