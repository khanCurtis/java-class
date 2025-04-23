/******************************************************************************

testScores
Khanon Curtis
4/23/25

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[100];
		int count = 0;
		int total = 0;
		
		System.out.println("Enter test scores (negative to stop):");
		while(count < 100) {
		    int score = input.nextInt();
		    
		    if(score < 0) {
		        break;
		    }
		    
		    scores[count] = score;
		    total += score;
		    count++;
		}
		
		if(count == 0) {
		    System.out.println("No valid scores entered!");
		    return;
		}
		
		double avg = (double)total / count;
		int aboveOrEqual = 0;
		int below = 0;
		
		for(int i = 0; i < count; i++) {
		    if(scores[i] >= avg) {
		        aboveOrEqual++;
		    } else {
		        below++;
		    }
		}
		
		System.out.printf("\nAverage score: %.2f", avg);
        System.out.println("\nNumber of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
		
	}
}
