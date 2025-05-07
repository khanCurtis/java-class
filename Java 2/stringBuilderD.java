/******************************************************************************

stringBuilderD
4/29/25
Khanon Curtis

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Append Strings: ");
		sb.append("Hello, ");
		sb.append("World");
		System.out.println(sb);
		System.out.println();
		
		System.out.println("Insert string at a specific index: ");
		sb.insert(5, " there");
	    System.out.println(sb);
		System.out.println();
	    
	    System.out.println("Replace a portion of the StringBuilder: ");
	    sb.replace(0, 11, "Goodbye");
	    System.out.println(sb);
		System.out.println();
		
		System.out.println("Get a substring: ");
		String substring = sb.substring(9, 14);
		System.out.println("Substring: " + substring);
		System.out.println();
	    
	    System.out.println("Delete characters within a range: ");
	    sb.delete(7, 14);
	    System.out.println(sb);
	    System.out.println();
	    
	    System.out.println("Reverse the order of characters: ");
	    sb.reverse();
	    System.out.println(sb);
		System.out.println();
	    
	    System.out.println("Get the current length: ");
	    int len = sb.length();
	    System.out.println("Length: " + len);
	    System.out.println();
	    
	    System.out.println("Get the capacity: ");
	    int cap = sb.capacity();
	    System.out.println("Capacity: " + cap);
	    System.out.println();
	    
	    System.out.println("Convert the StringBuilder to a String");
	    String str = sb.toString();
	    System.out.println("String: " + str);
	    System.out.println();
	    
	    System.out.println("Check if the StringBuilder is empty: ");
	    boolean isEmpty = sb.isEmpty();
	    System.out.println("Is empty: " + isEmpty);
	    sb.delete(0, len);
	    isEmpty = sb.isEmpty();
	    System.out.println("Is empty: " + isEmpty);
	    System.out.println();
	    
	}
}
