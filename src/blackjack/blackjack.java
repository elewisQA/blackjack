package blackjack;

public class blackjack {
	private int dealer, player;
	
	public void setDealer(int value) {
		if (value > 0) {
			dealer = value;
		} else {
			System.out.println("Dealer value cannot be below 0");
		}
	}
	
	public void setPlayer(int value) {
		if (value > 0) {
			player = value;
		} else {
			System.out.println("Player value cannot be below 0");
		}
	}
	
	public int compare() {
		// Compares integer values for the player and dealer
		// Whichever is closest to 21 (without going bust) wins. If both bust return 0. If draw, dealer wins.
		int closest = 0;
		if (player <= 21) {
			// Player not bust
			closest = 1;
		}
		if (dealer <= 21) {
			// Dealer not bust
			if (dealer >= player) {
				closest = 2;
			}
		}
		
		return closest;
	}

}
