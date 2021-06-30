package parking.system;

public class Level {
	/*
	 * Represents level in a parking garage
	 */
	private int floor;
	private ParkingSpot [] parkingSpots;
	private int availableSpots = 0; // number of free spots
	private static final int SPOT_PER_ROW = 10;
	public Level(int floor,int numberSpots) {
		
	}
	public int availableSpots() {
		return availableSpots;
	}
	/*
	 * Find a place to park this vehicle. Return false if failed
	 */
	public boolean parkVechicle(Vehical vehical) {
		return true;
	}
	/*
	 * Park a vehicle starting at the spot spotNumber and
	 * continuing until vechicle.spotsNeeded
	 */
	private boolean parkStartingAtSpot(int num, Vehical vehical) {
		return true;
	}
	/*
	 * Find a spot to park this vehicle. Return index of spot, or
	 * -1 on failure
	 */
	private int findAvailableSpots(Vehical vehical) {
		return 1;
	}
	/*
	 * When a car was removed from the spot increment available spots
	 */
	public void spotFreed() {
		availableSpots++;
	}
	

}
