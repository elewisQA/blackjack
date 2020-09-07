package blackjack;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		// Create objects
		Scanner in = new Scanner(System.in);	
		blackjack table = new blackjack();
		
		// Get user input
		System.out.print("Player Value: ");
		table.setPlayer(in.nextInt());
		
		System.out.print("Dealer Value: ");
		table.setDealer(in.nextInt());
		
		int result = table.compare();
		
		if (result == 1) {
			System.out.println("Player Wins!");
		} else if (result == 2) {
			System.out.println("Dealer Wins!");
		} else if (result == 0) {
			System.out.println("Nobody wins :(");
		} else {
			System.out.println("Error: Invalid value. (not between 0 and 2");
		}
	}

}
