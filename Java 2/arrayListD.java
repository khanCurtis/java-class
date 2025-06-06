/******************************************************************************

arrayListD
Khanon Curtis
5/7/25

*******************************************************************************/
import java.util.ArrayList;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {

		String[] friendsArray = {"John", "Chris", "Eric", "Luke"};
		
		ArrayList<String> friendsArrayList =
	        new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
	        
	       System.out.println(friendsArray[1]);
	       System.out.println(friendsArrayList.get(1));
	       
	       System.out.println(friendsArray.length);
	       System.out.println(friendsArrayList.size());
	       
	       friendsArrayList.add("Mitch");
	       System.out.println(friendsArrayList.get(4));
	       
	       friendsArray[0] = "Carl";
	       System.out.println(friendsArray[0]);
	       friendsArrayList.set(0, "Carl");
	       System.out.println(friendsArrayList.get(0));
	       
	       friendsArrayList.remove("Chris");
	       System.out.println(friendsArrayList.get(1));
	       
	       System.out.println(friendsArray);
	       System.out.println(friendsArrayList);
	       
	}
}
