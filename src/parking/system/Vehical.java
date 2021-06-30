package parking.system;

import java.util.ArrayList;

public abstract class Vehical{
	protected ArrayList<ParkingSpot> parkingSpots = 
			new ArrayList<ParkingSpot>();
	protected String licensePlate;
	protected int spotNeeded;
	protected VehicleSize size;
	
	public int getSpotsNeeded() {
		return spotNeeded;
	}
	
	public VehicleSize getSize() {
		return size;
	}
	/*
	 * park Vehicle in this spot  (among other's
	 * potentially
	 */
	public void parkInSpot(ParkingSpot parkingSpot) {
		parkingSpots.add(parkingSpot);
	}
	/*
	 * Remove vehicle from spot and notify spot that it's gone
	 */
	public void clearSpot() {
		
	}
	/*
	 * Checks if the spot is big enough for vehicle (and is available)
	 * This compares the SIZE only. It doesn't check it has enough
	 * spots.
	 */
	public abstract boolean canFitInSpot(ParkingSpot spot);
}
