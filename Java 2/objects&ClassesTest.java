/******************************************************************************

 Objects and Classes Test
 Khanon Curtis
 5/5/25

 *******************************************************************************/
public class Main
{
    public static void main(String[] args) {
        States state1 = new States("Utah", 82168, 3422487, .1505);
        States state2 = new States("New York", 47224, 19496810, .0404);

        System.out.printf("%s\nPopulation Density: %.2f\nPopulation in 5 years: %,.2f", state1.name, state1.populationDensity(), state1.estimateGrowth(5));

        System.out.printf("\n\n%s\nPopulation Density: %.2f\nPopulation in 5 years: %,.2f", state2.name, state2.populationDensity(), state2.estimateGrowth(5));
    }
}

class States {
    String name;
    int size;
    double population;
    double growthRate;

    States(String n, int s, double p, double g) {
        name = n;
        size = s;
        population = p;
        growthRate = g;
    }

    public double populationDensity() {
        double density = population / size;
        return density;
    }

    public double estimateGrowth(int years) {
        double growth = 0;
        for(int i = 0; i < years; i++) {
            growth = population * growthRate;
            population += growth;
        }

        return population;
    }
}
