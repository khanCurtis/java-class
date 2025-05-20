/******************************************************************************

rdFile
Khanon Curtis
5/19/25

*******************************************************************************/
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Famous Programming Quotes\n2. Computer Facts\n3. Tech Company Origins\n");
		int num = input.nextInt();
		
		readFile("text" + num + ".txt");
		
	
	}
	
	public static void readFile(String request) throws Exception {
	    FileReader fileReader = new FileReader(request);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    
	    System.out.println(" --- begin file --- ");
	    String line;
	    
	    while((line = bufferedReader.readLine()) != null) {
	        System.out.println(line);
	    }
	    
	    bufferedReader.close();
	    fileReader.close();
	    
	    System.out.println(" --- end file --- ");
	}
	
}
