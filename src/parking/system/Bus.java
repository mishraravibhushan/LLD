package parking.system;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Bus extends Vehical{
	
	public Bus() {
		spotNeeded = 5;
		size = VehicleSize.Large;
	}
	/*
	 * Checks if the spot is a large. Doesn't check if num of spots
	 * 
	 */
	public boolean canFitInSpot(ParkingSpot parkingSpot) {
		return true;
	}
	
}
