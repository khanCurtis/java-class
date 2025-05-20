/******************************************************************************

Demo Read & Write to a text file
Khanon Curtis
5/19/25

*******************************************************************************/
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;

public class Main
{
	public static void main(String[] args) throws Exception {
		readFile();
		writeFile();
		updateFile();
	}
	
	public static void readFile() throws Exception {
	    FileReader fileReader = new FileReader("in.txt");
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
	
	private static void writeFile() throws Exception {
	    FileWriter fileWriter = new FileWriter("out.txt");
	    
	    System.out.println(" --- Writing to File ---");
	    
	    fileWriter.write("Hello, Earth!\n");
	    fileWriter.write("Hello, Moon!\n");
	    fileWriter.write("Hello, Sun!");
	    
	    fileWriter.close();
	    
	    System.out.println(" --- Writing Complete ---");
	}
	
	private static void updateFile() throws Exception {
	    FileWriter writer = new FileWriter("out.txt", true);
	    
	    System.out.println(" --- Updating File --- ");
	    
	    writer.write("\nHello, Jupiter!\n");
	    writer.write("Hello, Saturn!\n");
	    writer.write("Hello, Pluto!");
	    
	    writer.close();
	    System.out.println(" --- Updating Complete --- ");
	}
	
}
