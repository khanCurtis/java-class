/******************************************************************************

seasons
Khanon Curtis
2/27/25

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    
    public static void spring() {
        System.out.println("The season is Spring, and the flowers are blooming!");
    }
    
    public static void summer() {
        System.out.println("The season is Summer, and it is getting hot!");
    }
    
    public static void fall() {
        System.out.println("The season is Fall, and the leaves are falling!");
    }
    
    public static void winter() {
        System.out.println("The season is Winter, and it is getting cold!");
    }
    
    public static void printError() {
        System.out.println("Err: Cannot Find Number in List");
        System.exit(0);
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a season (Spring=1 Summer=2 Fall=3 Winter=4) ");
		int season = input.nextInt();
		
		switch(season) {
		    case 1:
		        spring();
		        break;
		    case 2:
		        summer();
		        break;
		    case 3:
		        fall();
		        break;
		    case 4:
		        winter();
		        break;
		    default:
		        printError();
		}
	}
}
