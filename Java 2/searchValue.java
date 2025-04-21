/******************************************************************************

searchValue
Khanon Curtis
3/21/25

*******************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] random = new int[10];
        
        System.out.print("Array: ");
        for (int i = 0; i < random.length; i++) {
            random[i] = 1 + r.nextInt(99);
            System.out.print(random[i] + "   ");
        }
        
        System.out.print("\nValue to find: ");
        int search = input.nextInt();
        
        boolean found = false; // Track if the value was found
        
        for (int i = 0; i < random.length; i++) {
            if (random[i] == search) {
                System.out.printf("\n%d was found in the array", search);
                found = true;
            }
        }
        
        if (!found) {
            System.out.printf("\n%d was not found in the array", search);
        }
    }
}
