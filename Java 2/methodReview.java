/******************************************************************************

Demo Methods/Functions Review
Khanon Curtis
2/25/25

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		System.out.println("Beginning of program \n");
		
		myMethod();
		myMethod();
		myMethod();
		
		System.out.println("\nNext Method \n");
		
        myFamily("Khanon", 17);		
		myFamily("Natalya", 36);
		myFamily("Dehvon", 39);
		
		System.out.println("\nMethod returning Value \n");
		
		System.out.println(myReturnNumbers(10));
		System.out.println(myReturnTwo(7, 6));
		
		int z = myReturnThree(1, 2);
		System.out.println("Z: " + z);
		
		System.out.println("\nEnd of program \n");
		
	}
	
	public static void myMethod() {
	    System.out.println("I just got executed");
	}
	
	public static void myFamily(String fname, int age) {
	    String lname = "Curtis";
	    
	    if (fname == "Natalya") {
	        lname = "Taylor";
	    }
	    
	    System.out.printf("%s %s is %d. %n", fname, lname, age);
	    
	}
	
	public static int myReturnNumbers(int x) {
	    return 5 + x;
	}
	
	public static int myReturnTwo(int x, int y) {
	    return x + y;
	}
	
	public static int myReturnThree(int x, int y) {
	    return x + y;
	}
}
