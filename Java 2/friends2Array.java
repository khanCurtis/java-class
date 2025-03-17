/******************************************************************************

Friends2 Array
Khanon Curtis
3/17/25

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		
		String [] friends = new String [6];
		friends[0] = "Cindy";
		friends[1] = "Gayle";
		friends[2] = "David";
		friends[3] = "Ivan";
		friends[4] = "Esther";
		friends[5] = "Laura";
		
		int i;
		for(i = 0; i < friends.length; i++) {
		    System.out.printf("friend[%d] : %s\n", i, friends[i]);
		}
	}
}
