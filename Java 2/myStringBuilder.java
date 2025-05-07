/******************************************************************************

myStringBuilder
4/29/25
Khanon Curtis

Assignment: 
1st string uses default capacity which is 16.  Add a fun creative message. /
2nd string set a capacity.  Then add another message. /
3rd string create instance and set message in one statement. /
4th instance create and set the string to String #2 in one statement.
 
append /
delete /
deleteCharAt /
replace /
reverse /
length /
insert /
indexOf /
capacity /
toString/
lastIndexOf /

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int sbCap = sb.capacity();
		System.out.println("StringBuilder Capacity: " + sbCap);
		
		StringBuilder cb = new StringBuilder(50);
		int cbCap = cb.capacity();
		System.out.println("CapacityBuilder Capacity: " + cbCap);
		
		StringBuilder preset = new StringBuilder("Hello");
		System.out.println("Content Builder: " + preset);
		
		StringBuilder sm = new StringBuilder(cb.toString());
		System.out.println("String #2: " + sm);
		System.out.println();
		
		String result = preset.toString();
        System.out.println("Converted to String: " + result);
        System.out.println("Last index of 'o': " + preset.lastIndexOf("o"));
        System.out.println();
		
		System.out.println("Fun Message: ");
		sb.insert(0, "Hello, ");
		sb.append("World!");
		System.out.println(sb);
		System.out.println();
		
		System.out.println("Index Of: ");
		System.out.println(sb.indexOf("World"));
		System.out.println();
		
		System.out.println("Fun Message Reversed: ");
		sb.reverse();
		System.out.println(sb);
		System.out.println();
		
		sb.reverse();
		System.out.println("Replace: ");
		sb.replace(0, 5, "Goodbye");
		System.out.println(sb);
		System.out.println();
		
		System.out.println("Delete: ");
		sb.delete(7, 10);
		System.out.println(sb);
		System.out.println();
		
		System.out.println("Delete Char At: ");
		sb.deleteCharAt(3);
		System.out.println(sb);
		System.out.println();
		
		System.out.println("Message Length: ");
		int len = sb.length();
		System.out.println(len);
		System.out.println();
		
		
	}
}
