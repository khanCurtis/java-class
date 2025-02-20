/******************************************************************************

RockPaperScissors
Khanon Curtis
2/19/25

*******************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		String choice = "placeholder";
		String userChoice = "placeholder";
		int num = rand.nextInt(3);
		
		System.out.print("Rock (0),    Paper (1),   Scissors (2) : ");
		int user = input.nextInt();
		
		if (user > 2) {
		    System.out.println("Not a Choice!");
		    System.exit(0);
		}
		
		switch(user) {
		    case 0:
		        userChoice = "Rock";
		        if (num == 0) {
		            choice = "Rock";
		            System.out.printf("\nThe computer chose %s! You chose %s!\n", choice, userChoice);
		            System.out.println("It\'s a Tie!");
		        } else if (num == 1) {
		            choice = "Paper";
		            System.out.printf("\nThe computer chose %s! You chose %s!\n", choice, userChoice);
		            System.out.println("You Lost!");
		        } else {
		            choice = "Scissors";
		            System.out.printf("\nThe computer chose %s! You chose %s!\n", choice, userChoice);
		            System.out.println("You Won!");
		        }
		        break;
		    case 1: 
		        userChoice = "Paper";
		        if (num == 1) {
		            choice = "Paper";
		            System.out.printf("\nThe computer chose %s! You chose %s!\n", choice, userChoice);
		            System.out.println("It\'s a Tie!");
		        } else if (num == 2) {
		            choice = "Scissors";
		            System.out.printf("\nThe computer chose %s! You chose %s!\n", choice, userChoice);
		            System.out.println("You Lost!");
		        } else {
		            choice = "Rock";
		            System.out.printf("\nThe computer chose %s! You chose %s!\n", choice, userChoice);
		            System.out.println("You Won!");
		        }
		        break;
		    case 2: 
		        userChoice = "Scissors";
		        if (num == 2) {
		            choice = "Scissors";
		            System.out.printf("\nThe computer chose %s! You chose %s!\n", choice, userChoice);
		            System.out.println("It\'s a Tie!");
		        } else if (num == 0) {
		            choice = "Rock";
		            System.out.printf("\nThe computer chose %s! You chose %s!\n", choice, userChoice);
		            System.out.println("You Lost!");
		        } else {
		            choice = "Paper";
		            System.out.printf("\nThe computer chose %s! You chose %s!\n", choice, userChoice);
		            System.out.println("You Won!");
		        }
		        break;
		}
		
	}
}
