/******************************************************************************

TuitEstimator (While loop)
Khanon Curtis
2/25/25

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		double tuition = 10000;
		
		int i = 0; 
		while (tuition < 20000) {
		    double increase = 0.08 * tuition;
		    tuition += increase;
		    i++;
		}
		
		System.out.printf("Tuition will be doubled in %d years %n", i);
		System.out.printf("Tuition will be $%,.2f in %d years", tuition, i);
		
	}
}
