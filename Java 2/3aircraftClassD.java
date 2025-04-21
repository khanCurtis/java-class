/******************************************************************************

3Aircraft Class Demo
Khanon Curtis
4/21/25

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		aircraft cessna172 = new aircraft();
		aircraft piperSaratoga = new aircraft();
		
		cessna172.passengers = 4;
		cessna172.cruiseSpeed = 140;
		cessna172.fuelCapacity = 56.5;
		cessna172.fuelBurnRate = 9.5;
	
	    piperSaratoga.passengers = 6;
	    piperSaratoga.cruiseSpeed = 201;
	    piperSaratoga.fuelCapacity = 102.5;
	    piperSaratoga.fuelBurnRate = 20.5;
	    
	    double enduranceSaratoga = piperSaratoga.calculateEndurance();
	    
	    System.out.println("Cessna 172 passengers: " + cessna172.passengers);
		System.out.println("Cessna 172 fuel burn rate: " + cessna172.fuelBurnRate + " gph");
	    System.out.println("Cessna 172 Endurance is: " + cessna172.calculateEndurance());
	    System.out.println("For Cessna 172 to fly for 2.5 hours, it takes " + cessna172.fuelNeeded(2.5) + " gallons of fuel.");
	    
	    System.out.println("\nPiper Saratoga passengers: " + piperSaratoga.passengers);
		System.out.println("Piper Saratoga fuel burn rate: " + piperSaratoga.fuelBurnRate + " gph");
	    System.out.println("Piper Saratoga Endurance is: " + enduranceSaratoga);
	    System.out.println("For Piper Saratoga to fly for 4.2 hours, it takes " + piperSaratoga.fuelNeeded(4.2) + " gallons of fuel.");
	    
	}
}

class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;
    
    double calculateEndurance() {
        double endurance;
        
        endurance = fuelCapacity / fuelBurnRate;
        
        return endurance;
    }
    
    double fuelNeeded(double time) {
        return fuelBurnRate * time;
    }
}
