/******************************************************************************

wordRepeat
Khanon Curtis
4/23/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String word = input.nextLine();
		int wordLength = word.length();
		int wordValue = 0;
		
		while(wordValue < wordLength){
		    System.out.println(word);
		    wordValue++;
		}
	}
}
