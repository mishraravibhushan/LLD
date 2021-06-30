package parking.system;

public class MotorCycle extends Vehical{
	public MotorCycle() {
		spotNeeded = 1;
		size = VehicleSize.Small;
	}
	
	/*
	 * Checks if the spot is a compact or large
	 */
	public boolean canFitInSpot(ParkingSpot parkingSpot) {
		return true;
	}

}
