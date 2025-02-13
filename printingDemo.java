/******************************************************************************

Demo Of Printing
Khanon Curtis
2/12/24

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		//ESCAPE SEQUENCES
		System.out.println("Khanon Curtis \n2/12/24");
		
		//I     am      tabbing!
		System.out.println("I \tam \ttabbing!");
		
		//PRINT FORMATTING
		String fname = "John";
		String lname = "Doe";
		int numPet = 7;
		String petType = "chickens";
		
		
		
		//Hello, John Doe!
		System.out.println("Hello, " + fname + " " + lname + "!");
		System.out.printf("Hello, %s %s! %n", fname, lname);
		
		//My name is John.
		System.out.printf("My name is %s. %n", fname);
		
		//John has chickens
		System.out.printf("%s has %s %n", fname, petType);
		
		//John Doe has 7 chickens
		System.out.printf("%s %s has %d %s %n", fname, lname, numPet * 4, petType);
		
		double total = 12345678.909876;
		System.out.printf("Total, $ %,.3f", total);
		
		
		
		
	}
}
