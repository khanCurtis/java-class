/******************************************************************************

String Method Test
Khanon Curtis
2/13/25

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String fname = "Khanon";
		String lname = "Curtis";
		String fullName = fname.concat(" ").concat(lname);
		String testStr = "The quick brown fox jumps over the lazy dog";
		String school1 = "Riverton High School";
		String school2 = "Jordan Academy for Technology Careers";
		String school3 = "Western Goveners University";
		String city = "Salt Lake City";
		String state = "UT";
		String zip = "84101";
		String addr = city.concat(" ").concat(state + " ").concat(zip);
		
		System.out.println(lname.length());
		System.out.println("Last Name Length: " + lname.length());
		
		System.out.println(fullName);
		
		System.out.println(addr);
		
		System.out.println(fullName.toUpperCase());
		
		System.out.println(school1.contains("High"));
		System.out.println(school2.contains("High"));
		System.out.println(school2.endsWith("School"));
		System.out.println(school3.endsWith("University"));
		
		System.out.println(testStr.charAt(10));
		
		System.out.println(testStr.indexOf("fox"));
		System.out.println(testStr.indexOf("jumps"));
		
		String col = testStr.substring(10, 15);
		System.out.println(col);
		
		String regexTarget = "\\bbrown fox\\b";
		String wordReplace = testStr.replaceAll(regexTarget, "silver wolf");
		System.out.println(wordReplace);
	}
}
