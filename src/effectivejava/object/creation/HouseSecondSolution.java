package effectivejava.object.creation;

public class HouseSecondSolution {
	private  int length; //Required
	private  int breadth;//Required
	private  int height;//Required
	private  int price;
	private  int areaInSqft;
	private  int numberOfRooms;
	private  int numberOfBalcony;
	
	public HouseSecondSolution() {
		
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAreaInSqft(int areaInSqft) {
		this.areaInSqft = areaInSqft;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public void setNumberOfBalcony(int numberOfBalcony) {
		this.numberOfBalcony = numberOfBalcony;
	}
	
	public static void main(String[] args) {
		HouseSecondSolution houseSecondSolution = new HouseSecondSolution();
		houseSecondSolution.setAreaInSqft(0);
		houseSecondSolution.setBreadth(0);
		houseSecondSolution.setHeight(0);
	}

}
