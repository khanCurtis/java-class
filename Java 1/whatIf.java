/******************************************************************************

whatIf
Khanon Curtis
3/10/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    System.out.printf("input an amount of people: ");
		int ppl = input.nextInt();
		
		System.out.printf("input an amount of cats: ");
		int cats = input.nextInt();
		
		System.out.printf("input an amount of dogs: ");
		int dogs = input.nextInt();
		
		if(ppl < cats){
		    System.out.printf("\nCATS ARE TAKING OVER");
		} 
		
		if(ppl < dogs){
		    System.out.printf("\nDOGS ARE TAKING OVER");
		} 
		
        if(cats < dogs){
		    System.out.printf("\nIts raining more dogs than cats!");
		} 

        if(dogs < cats){
		    System.out.printf("\nIts raining more dogs than cats!");
		} 

        if(dogs == cats){
		    System.out.printf("\nIts raining cats and dogs!");
		}
		
		if(ppl == dogs){
		    System.out.printf("\nThe world is at peace with people and dogs");
		} 
		
		if(ppl == cats){
		    System.out.printf("\nThe world is at peace with people and cats");
		}
		
        if(cats != dogs){
		    System.out.printf("\nThe cats and dogs are uneven!");
		} else {
		    System.out.printf("\nThe cats and dogs are even!");
		}
		
	}
}
