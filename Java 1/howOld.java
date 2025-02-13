/******************************************************************************

How old
Khanon Curtis
3/10/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hey, what's your name?  ");
		String name = input.nextLine();
		
		System.out.printf("Okay, %s, how old are you?  ", name);
		int age = input.nextInt();
		
		if(age <= 20){
		    System.out.printf("\nYou can't drink, %s", name);
		} 
		if(age >= 21){
		    System.out.printf("\nYou're old enough to drink %s!", name);
		}
		
		if(age <= 15){
		    System.out.printf("\nYou can't get your license %s!", name);
		} 
		if(age >= 16){
		    System.out.printf("\nYou can get your license %s!", name);
		}
		
		if(age <= 18){
		    System.out.printf("\nYou're still in school %s!", name);
		} 
		
		if(age >= 19){
		    System.out.printf("\nYou should be out of high school %s!", name);
		}
		
		if(age <= 24){
		    System.out.printf("\nyou are still on your parents insurance %s.", name);
		} 
		
		if(age >= 25){
		    System.out.printf("\nyou can't be on your parents insurance %s!", name);
		}
	}
}
