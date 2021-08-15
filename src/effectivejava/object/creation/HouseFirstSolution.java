package effectivejava.object.creation;

public class HouseFirstSolution {
	
	private final int length; //Required
	private final int breadth;//Required
	private final int height;//Required
	private final int price;
	private final int areaInSqft;
	private final int numberOfRooms;
	private final int numberOfBalcony;
	
	public  HouseFirstSolution (int length,int breadth,int height){
		this(length,breadth,height,0);
	}
	public  HouseFirstSolution (int length,int breadth,int height,int price){
		this(length,breadth,height,price,0);
	}
	public  HouseFirstSolution (int length,int breadth,int height,int price,int areaInSqft){
		this(length,breadth,height,price,areaInSqft,0);
	}
	public  HouseFirstSolution (int length,int breadth,int height,int price,int areaInSqft,int numberOfRooms ){
		this(length,breadth,height,price,areaInSqft,numberOfRooms,0);
	}
	public  HouseFirstSolution (int length,int breadth,int height,int price,int areaInSqft,int numberOfRooms,int numberOfBalcony){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		this.price = price;
		this.areaInSqft = areaInSqft;
		this.numberOfRooms = numberOfRooms;
		this.numberOfBalcony = numberOfBalcony;
	}
	
	HouseFirstSolution firstSolution = new HouseFirstSolution(0, 0, 0);
	HouseFirstSolution firstSolutionObjectTwo = new HouseFirstSolution(0, 0, 0,0);


}
