/******************************************************************************

Objects and Classes Test
Khanon Curtis
5/5/25

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		States state1 = new States("Utah", 82168, 3422487, 15.05);
		States state2 = new States("New York", 47224, 19496810, 4.04);
		
		System.out.printf("%s\nPopulation Density: %f\nPopulation in 5 years: %f", state1.name, state1.populationDensity(), state1.growthRate);
	}
}
	
class States() {
    String name;
    int size;
    double population;
    double growthRate;
    
    States() {
        name = " ";
        size = 1;
        population = 1;
        growthRate = estimateGrowth();
    }
    
    public double populationDensity() {
        double density = population / size;
    }
    
    public double estimateGrowth(int counter) {
        counter = 0;
        for(int i = 0; i < 5; i++) {
            
        }
    }
}
