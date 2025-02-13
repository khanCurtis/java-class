/*
SUU Scholarship
Khanon Curtis
4/2/24
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your GPA: ");
        float gpa = input.nextFloat();

        System.out.print("Please enter your ACT Score: ");
        int act = input.nextInt();

        System.out.print("Please enter your SAT Score: ");
        int sat = input.nextInt();

        if(gpa >= 3.90 && gpa <= 4.0 || act >= 33 && act <= 36 || sat >= 1450 && sat <= 1600){
        System.out.println("You are eligible for a Fellow's Scholarship");
        else if(gpa >= 3.80 && gpa <= 3.89  || act >= 30 && act <= 32 || sat >= 1360 && sat <= 1420 ){
                System.out.println("You are eligible for a Founder's Scholarship");
        else if(gpa >= 3.60 && gpa <= 3.79 || act >= 27 && act <= 29 || sat >= 1260 && sat <= 1330 ){
                System.out.println("You are eligible for a Deans' Scholarship");
        else if(gpa >= 3.40 && gpa <= 3.59 || act >= 23 && act <= 26 || sat >= 1130 && sat <= 1230 ){
            System.out.println("You are eligible for a Centurium Scholarship");
            
                    }
                }
            }
        }
    }
}
