/******************************************************************************

Demo: Arrays
Khanon Curtis
3/17/25

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		//String [] cars;
		String [] cars = new String [5]; //created array named cars w len of 5
		
		cars[0] = "Toyota";
		cars[1] = "Honda";
		cars[2] = "BMW";
		cars[3] = "Ford";
		cars[4] = "Tesla";
		
		System.out.println("Car 4: " + cars[3]);
		System.out.println("Car 5: " + cars[4]);
		//System.out.println("Car 6: " + cars[5]);
		
		//array of integers
		int [] numList = {10, 20, 30, 40, 50, 60};
		System.out.println("num2 = " + numList[1]);
		
		int calculation = numList[2] * numList[3];
		System.out.println(calculation);
		
		numList[5] = numList[1] + numList[3];
		System.out.println(numList[5]);
		
		//length property
		System.out.println("cars array length: " + cars.length);
		System.out.println("numList array length: " + numList.length);
		
		//for loop to print array
		for(int i = 0; i < cars.length; i++) {
		    System.out.println(cars[i]);
		}
		
		//initializing arrays with input values
		double [] myList = new double[10];
		System.out.print("Enter " + myList.length + " values: ");
		for(int i = 0; i < myList.length; i++) {
		    myList[i] = input.nextDouble();
		}
		
		//initializing arrays with random values
		for(int i = 0; i < myList.length; i++) {
		    myList[i] = Math.random() * 100;
		    System.out.println(myList[i]);
		}
		
		//using random number util
		int [] myList2 = new int[12];
		for(int i = 0; i < myList.length; i++) {
		    myList2[i] = 1 + r.nextInt(99);
		    System.out.print(myList2[i] + " ");
		}
		
		//display array output
		for (int i = 0; i < myList2.length; i++) {
             System.out.print(myList2[i] + " ");
		}
		
		//summing all elements
		double total = 0;
		
		for (int i = 0; i < myList2.length; i++) {
		    total += myList2[i];
		    System.out.println(total);
		}
		
		//finding largest array elements
		double max = myList2[0];
		
		for (int i = 0; i < myList2.length; i++) {
		    if (myList2[i] > max) {
		        max = myList2[i];
		    }
		    System.out.println(max);
		}
		
	}
}
