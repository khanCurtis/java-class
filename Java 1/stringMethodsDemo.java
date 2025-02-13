/******************************************************************************

Khanon Curtis
Demo Of String Methods

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		String fname = "Khanon";
		String lname = "Curtis";
		String fullName = fname + " " + lname;
		
		System.out.println(fullName);
		//Example of String Methods
		System.out.println(fullName.toLowerCase());
		System.out.println(fullName.toUpperCase());
		
		System.out.println(fullName.length()); //returns int
		
		String school = "riverton high school";
		System.out.println(school.contains("high")); //returns bool
		
		String school2 = "Riverton High School";
		System.out.println(school.equals(school2)); //returns bool
		System.out.println(school.equalsIgnoreCase(school2));
		
		System.out.println(school.substring(9));
		String subpart = school.substring(14);
		System.out.println(subpart);
		System.out.println(school.substring(0, 8));
		
		String fname3 = fname.substring(0, 3);
		System.out.println(fname3.toLowerCase() + "." + lname.toLowerCase() + "@gmail.com");
		
		String email = fname3.toLowerCase() + "." + lname.toLowerCase() + "@gmail.com";
		System.out.println(email);
	}
}
