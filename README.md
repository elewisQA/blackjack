# Blackjack  
This is a very basic java class, emulating black-jack.  
Two values are set one for the player and one for the dealer.   
Dealer wins if there is a draw.
  
## Usage:
The 'runner' class containing the main method creates an instance of the blackjack class.  
Values for player and dealer are set using setter methods  
i.e: `setDealer(5)`  
The comparison is made by calling `compare()`, this returns three possible values:
* 0 if both players bust
* 1 if the player wins
* 2 if the dealer wins  
An if-statement in the main method converts this to "X player wins!" (or looses)
