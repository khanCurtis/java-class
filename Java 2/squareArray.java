/******************************************************************************

squareArray
Khanon Curtis
4/7/25

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int [] square = new int [100];
		
		for(int i = 0; i < square.length; i++) {
		    square[i]++;
		    int sqrt = i * i;
		    System.out.printf("%d : %d\n", i, sqrt);
		}
	}
}
