package parking.system;

public class ParkingSpot {
	private Vehical vehical;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;
	
	public ParkingSpot(Level level,int r,int n,VehicleSize size) {
		
	}
	
	public boolean isAvailable() {
		return vehical == null;
	}
	
	/*
	 * Check if the spot is bieg enough and is available
	 */
	public boolean canFitVehicle(Vehical vehical) {
		return true;
	}
	/*
	 * Park vehicle in this spot
	 */
	public int getRow() {
		return row;
	}
	public int getSpotNumber() {
		return spotNumber;
	}
	/*
	 * Remove vehicle from spot, and notify level that a new spot
	 * is available 
	 */
	public void removeVehicle() {
		
	}

}
