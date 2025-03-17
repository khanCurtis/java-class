/******************************************************************************

random Array
Khanon Curtis
3/17/25

*******************************************************************************/
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Random r = new Random();
		
		int [] random = new int [10];
		
		for(int i = 0; i < random.length; i++) {
		    random[i] = 1 + r.nextInt(99);
		    System.out.printf("random[%d] : %d\n", i, random[i]);
		}
	}
}
