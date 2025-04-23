/******************************************************************************

pick4Cards
Khanon Curtis
4/23/25

*******************************************************************************/
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    
	    Random r = new Random();
	    
		int[] deck = new int[52];
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	    for (int i = 0; i < deck.length; i++) {
	        deck[i] = i;
	    }
	    
	    for (int i = deck.length - 1; i > 0; i--) {
	        int j = r.nextInt(i + 1);
	        int temp = deck[i];
	        deck[i] = deck[j];
	        deck[j] = temp;
	    }
	    
	    for (int i = 0; i < 4; i++) {
	        int cardNum = deck[i];
	        String suit = suits[cardNum / 13];
	        String rank = ranks[cardNum % 13];
	        
	        System.out.println(rank + " of " + suit);
	    }
	    
	}
}
