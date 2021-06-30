package parking.system;

public class Car extends Vehical{
	public Car() {
		spotNeeded = 1;
		size = VehicleSize.Medium;
	}
	/*
	 * Checks if this spot is Compact or a large
	 */
	public boolean canFitInSpot(ParkingSpot parkingSpot) {
		return true;
	}

}
