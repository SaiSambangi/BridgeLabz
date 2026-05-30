package com.day04;

public class SankeAndLadderGame {


	    static final int NO_PLAY = 0;
	    static final int LADDER = 1;
	    static final int SNAKE = 2;

	    public static int rollDice() {
	        return (int)(Math.random() * 6) + 1;
	    }

	    public static int getOption() {
	        return (int)(Math.random() * 3);
	    }

	    public static void main(String[] args) {

	        int player1Position = 0;
	        int player2Position = 0;

	        int diceCount = 0;

	        while(player1Position < 100 && player2Position < 100) {

	            // PLAYER 1 TURN
	            boolean playAgain;

	            do {

	                playAgain = false;

	                int dice = rollDice();
	                int option = getOption();

	                diceCount++;

	                switch(option) {

	                    case NO_PLAY:
	                        break;

	                    case LADDER:

	                        if(player1Position + dice <= 100) {
	                            player1Position += dice;
	                        }

	                        playAgain = true;
	                        break;

	                    case SNAKE:

	                        player1Position -= dice;

	                        if(player1Position < 0) {
	                            player1Position = 0;
	                        }

	                        break;
	                }

	                System.out.println(
	                        "Player1 -> Dice: " + dice +
	                        " Position: " + player1Position);

	            } while(playAgain && player1Position < 100);

	            if(player1Position == 100) {
	                System.out.println("\nPlayer 1 Won!");
	                break;
	            }

	            // PLAYER 2 TURN
	            do {

	                playAgain = false;

	                int dice = rollDice();
	                int option = getOption();

	                diceCount++;

	                switch(option) {

	                    case NO_PLAY:
	                        break;

	                    case LADDER:

	                        if(player2Position + dice <= 100) {
	                            player2Position += dice;
	                        }

	                        playAgain = true;
	                        break;

	                    case SNAKE:

	                        player2Position -= dice;

	                        if(player2Position < 0) {
	                            player2Position = 0;
	                        }

	                        break;
	                }

	                System.out.println(
	                        "Player2 -> Dice: " + dice +
	                        " Position: " + player2Position);

	            } while(playAgain && player2Position < 100);

	            if(player2Position == 100) {
	                System.out.println("\nPlayer 2 Won!");
	                break;
	            }
	        }

	        System.out.println("\nTotal Dice Rolls: " + diceCount);
	    }
}
