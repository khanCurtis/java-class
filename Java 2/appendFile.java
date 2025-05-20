/******************************************************************************

appendFile
Khanon Curtis
5/20/25

*******************************************************************************/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of the file to write to: ");
		String fileName = input.nextLine();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
		
		System.out.println(" --- Writing --- ");
		
		writer.write("Hello, Earth!");
		writer.newLine();
		writer.write("Hello, Moon!");
		writer.newLine();
		writer.write("Hello, Sun!");
		writer.newLine();
		
		writer.close();
		
		System.out.println(" --- Writing Complete --- ");
	}
}
