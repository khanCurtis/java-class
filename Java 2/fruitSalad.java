/******************************************************************************

fruitSalad
Khanon Curtis
5/7/25

*******************************************************************************/
import java.util.ArrayList;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> fruitSalad =
		    new ArrayList<>(Arrays.asList("Apples", "Bananas", "Grapes", "Oranges"));
	    
	    System.out.println(fruitSalad);
	    
	    fruitSalad.add(2, "Melons");
	    
	    System.out.println(fruitSalad.size());
	    System.out.println(fruitSalad.get(3) + "\n");
	    
	    fruitSalad.remove(1);
	    
	    for (int i = 0; i < fruitSalad.size(); i++) {
	        System.out.println(fruitSalad.get(i));
	    }
	    
	    fruitSalad.remove("Apples");
	    fruitSalad.add("Strawberries");
	    fruitSalad.add("Blueberries");
	    
	    for (int i = 0; i < fruitSalad.size(); i++) {
	        System.out.println(fruitSalad.get(i));
	    }
	    
	    fruitSalad.clear();
	    
	    System.out.println(fruitSalad);
	}
}
