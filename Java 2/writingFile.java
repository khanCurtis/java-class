/******************************************************************************

writingFile
Khanon Curtis
5/20/25

*******************************************************************************/
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of the file to write to: ");
		String fileName = input.nextLine();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		BufferedWriter append = new BufferedWriter(new FileWriter(fileName, true));
		
		System.out.println(" --- Starting Writer --- ");
		
		writer.write("Hello, World!");
        writer.newLine();
        writer.write("Hello, Mars!");
        writer.newLine();
        writer.write("Hello, Venus!");
        writer.newLine();
        writer.close();
        
        System.out.println(" --- Writer Finished --- ");
        
        System.out.println(" --- Appending --- ");
        
        append.write("Year is Over!");
        append.close();
        
        System.out.println(" --- Apending Complete --- ");
        
        writer.close();
	    append.close();
	}
}
