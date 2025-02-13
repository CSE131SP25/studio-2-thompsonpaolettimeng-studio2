package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you start with?");
		double startAmount = in.nextDouble();
		System.out.println("What is the probability that you win?");
		double winChance = in.nextDouble();
		System.out.println("How much money do you want to win before stoping?");
		double winLimit = in.nextDouble();
		System.out.println("How many days do you want to play?");
		int totalSimulations = in.nextInt(); 
		int numTimesPlayedToday = 0;
		
		for(int i = 1; i <= totalSimulations; i++ ) {
			double dayAmount = startAmount;
			numTimesPlayedToday = 0;
			while(dayAmount > 0 && dayAmount < winLimit) {
				double win = Math.random();
				if (win <= winChance) {
				dayAmount++;
				System.out.println("You now have: " + dayAmount);
				}
				else {
				dayAmount--;
				System.out.println("You now have: " + dayAmount);
				}
				numTimesPlayedToday++;
			}
			System.out.println("Day Number: " + i + ". You played " + numTimesPlayedToday + " many times today.");
			if (dayAmount == 0) {
			System.out.println("Today, you went broke!");
			}
			if(dayAmount == winLimit) {
			System.out.println("Today, you won!");
				 
			}
			
		}
	}
}
