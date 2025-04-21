/******************************************************************************

1Aircraft Class Demo
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
		
		System.out.println("Cessna 172 passengers: " + cessna172.passengers);
		System.out.println("Cessna 172 fuel burn rate: " + cessna172.fuelBurnRate + " gph");
	
	    piperSaratoga.passengers = 6;
	    piperSaratoga.cruiseSpeed = 201;
	    piperSaratoga.fuelCapacity = 102.5;
	    piperSaratoga.fuelBurnRate = 20.5;
	    
	    System.out.println("\nPiper Saratoga passengers: " + piperSaratoga.passengers);
		System.out.println("Piper Saratoga fuel burn rate: " + piperSaratoga.fuelBurnRate + " gph");
	
	}
}

class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;
}
