/******************************************************************************

DEMO String Methods 2
Khanon Curtis
2/13/25

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    //length
		String msg = "Welcome to Riverton High!";
		System.out.println(msg.length());
		System.out.println("Message Length: " + msg.length());
		
		//charAt
		System.out.println(msg.charAt(3));
		System.out.println(msg.charAt(11));
		
		//concatenation
		String col = "red";
		String animal = "cow";
		
		String animal2 = col + " " + animal;
		System.out.println(animal2);
		
		animal2 = col.concat(animal);
		String animal3 = col.concat(" ").concat(animal);
		System.out.println(animal2);
		System.out.println(animal3);
		
		//toUpperCase / toLowerCase
		System.out.println(animal3.toUpperCase());
		System.out.println(msg.toLowerCase());
		
		//equals / equalsIgnoreCase
		String school1 = "Riverton High School";
		String school2 = "riverton high school";
		
		System.out.println(school1.equals(school2)); //return if the variables are equal (true/false)
		System.out.println(school1.equalsIgnoreCase(school2));
		
		//compareTo
		String word1 = "cat";
		String word2 = "cat";
		String word3 = "flower";
		
		System.out.println(word1.compareTo(word2)); //returns 0 if strings are equal
		System.out.println(word1.compareTo(word3)); //returns less than 0 if string is less than the other string (chars)
		System.out.println("fig".compareTo("banana")); //returns more than 0 if string is greater than other string (chars)
		
		//startsWith / endsWith
		System.out.println(word3.startsWith("f")); //returns bool if true/false
		System.out.println(word3.startsWith("ba"));
		
		System.out.println(word3.endsWith("o"));
		System.out.println(word3.endsWith("er"));
		
		//contains
		String address = "Salt Lake City, UT 84044";
		
		System.out.println(address.contains("84044")); //returns bool if true/false
		System.out.println(address.contains("ut"));
		System.out.println(address.contains("UT"));
		
		//indexOf
		msg = "We spring forward with daylight savings in the spring.";
		
		System.out.println(msg.indexOf("daylight")); //returns position number of the first occurence of the chars specified
		System.out.println(msg.indexOf("spring"));
		
	}
}
