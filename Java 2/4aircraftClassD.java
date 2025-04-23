/******************************************************************************

4Aircraft Class Demo
Khanon Curtis
4/21/25

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		aircraft cessna172 = new aircraft(4, 140, 56.5, 9.5);
		aircraft piperSaratoga = new aircraft(6, 201, 102.5, 20.5);
	    
	    double enduranceSaratoga = piperSaratoga.calculateEndurance();
	    
	    System.out.println("Cessna 172 passengers: " + cessna172.passengers);
		System.out.println("Cessna 172 fuel burn rate: " + cessna172.fuelBurnRate + " gph");
	    System.out.println("Cessna 172 Endurance is: " + cessna172.calculateEndurance());
	    System.out.println("For Cessna 172 to fly for 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + " gallons of fuel.");
	    
	    System.out.println("\nPiper Saratoga passengers: " + piperSaratoga.passengers);
		System.out.println("Piper Saratoga fuel burn rate: " + piperSaratoga.fuelBurnRate + " gph");
	    System.out.println("Piper Saratoga Endurance is: " + enduranceSaratoga);
	    System.out.println("For Piper Saratoga to fly for 1.25 hours, it takes " + piperSaratoga.fuelNeeded(1.25) + " gallons of fuel.");
	    
	}
}

class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;
    
    aircraft(int p, int c, double fc, double fbr) {
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    }
    
    double calculateEndurance() {
        double endurance;
        
        endurance = fuelCapacity / fuelBurnRate;
        
        return endurance;
    }
    
    double fuelNeeded(double time) {
        return fuelBurnRate * time;
    }
}
