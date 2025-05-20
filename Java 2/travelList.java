/******************************************************************************

Travel List
Khanon Curtis
5/15/25

*******************************************************************************/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> internationalTravel =
		    new ArrayList<>(Arrays.asList("London", "Paris", "Venice", "Rome"));
		ArrayList<String> usTravel =
		    new ArrayList<>(Arrays.asList("Nashville", "New York", "Miami", "Denver"));
		ArrayList<String> travelList = new ArrayList<>();
		
		travelList.addAll(internationalTravel);
		travelList.addAll(2, usTravel);
		System.out.println(travelList);
		
		travelList.add("Tokyo");
		System.out.println(travelList);
		
		System.out.println(travelList.size());
		
		System.out.println("Paris: " + travelList.contains("Paris"));
		System.out.println("Seoul: " + travelList.contains("Seoul"));
		System.out.println("New York: " + travelList.indexOf("New York"));
		System.out.println("U.S. List Empty: " + usTravel.isEmpty());
		
		travelList.add(2, "Dubai");
		travelList.remove("Denver");
		travelList.remove(3);
		System.out.println(travelList);
		
		Collections.sort(travelList);
		System.out.println(travelList);
		
		Collections.reverse(travelList);
		System.out.println(travelList);
	}
}
