import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
	
	final static int ROCK = 1;
	final static int PAPER = 2;
	final static int SCISSORS = 3;
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int playerNum;
		String playerChoice;
		String computerChoice;
		String winner;
		String playerInput;
		
		
		do {
			//System.out.println("The Rock, Paper, Scissors game will now begin!");
			//System.out.println("Enter a (1) for Rock /n(2)for Paper /n(3)for Scissors");
			//playerNum = player.nextInt();	
			
			playerChoice = playerChoice();
			computerChoice = computerChoice();
			System.out.println("Player chose: " + playerChoice);
			System.out.println("Computer chose: " + computerChoice);
			
			
			winner = winner(computerChoice,playerChoice);
			
			System.out.println(winner);
			
			System.out.println("Would you like to keep playing? If so enter yes, If not enter a no");
			playerInput = input.next();
			
			if(playerInput.equals("no")) {
				System.out.println("Program exitting");
				System.exit(0);
				break;
			}
			else if (playerInput.equals("yes")) {
				continue;
			}
			
								
		}while(!playerInput.equals("no"));
		
		
		

	}
	
/////////////////////////////////////////////
	public static String computerChoice() {
		Random rand = new Random();
		
		String computerMove = "";
	    int computerNum = rand.nextInt(3)+1;
	    
	    if (computerNum == ROCK) {
	    	computerMove = "Rock";
	    }
	    else if (computerNum == PAPER) {
	    	computerMove = "Paper";
	    }
	    else if (computerNum == SCISSORS) {
	    	computerMove = "Scissors";
	    }
	    
		return computerMove;
		
	}
////////////////////////////////////////////////
	public static String playerChoice() {
		Scanner player = new Scanner(System.in);
		System.out.println("The Rock, Paper, Scissors game will now begin!");
		System.out.println("Enter a (1) for Rock (2)for Paper (3)for Scissors");
		int playerNum = player.nextInt();
		String playerMove = "";
		
		if (playerNum == ROCK) {
			playerMove = "Rock";
		}
		else if (playerNum == PAPER) {
			playerMove = "Paper";
		}
		else if (playerNum == SCISSORS) {
			playerMove = "Scissors";
		}
		
		
		return playerMove;
	}
	////////////////////////////////////////////////////
	public static String winner(String computerMove, String playerMove) {
		
		String winner = null;
		
		if(playerMove.equals("Rock")) { 
			if (computerMove.equals("Scissors")) {
				winner = "Rock smashes Scissors, You Win!";
			}
			else if (computerMove.equals("Paper")) {
				winner = "Paper covers Rock, You Lose!";	
			}
			if (computerMove.equals("Rock")) {
				winner = "It is a Tie";
			}
		}
		else if (playerMove.equals("Paper")) { 
            if (computerMove.equals("Scissors")) {
				winner = "Scissors cut Paper, You Lose!";
			}
            else if (computerMove.equals("Rock")) {
				winner = "Paper covers Rock, You Win!";
			}
			if (computerMove.equals("Paper")) {
				winner = "It is a Tie";	
			}
		}
		else if (playerMove.equals("Scissors")) {
				if (computerMove.equals("Paper")) {
					winner = "Scissors cuts Paper, You Win!";
				}
				else if (computerMove.equals("Rock")) {
					winner = "Rock smashes Scissors, You Lose!";
				}
				if (computerMove.equals("Scissors")) {
					winner = "It is a Tie";
				}
			}

		

			return winner;
		}
	
	
	
	
	
}
