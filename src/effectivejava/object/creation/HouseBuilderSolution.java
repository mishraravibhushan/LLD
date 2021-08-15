package effectivejava.object.creation;

public class HouseBuilderSolution {
	private  final int length; //Required
	private  final int breadth;//Required
	private  final int height;//Required
	private  final int price;
	private  final int areaInSqft;
	private  final int numberOfRooms;
	private  final int numberOfBalcony;
	
	private static class Builder{
		private  final int length; //Required
		private  final int breadth;//Required
		private  final int height;//Required
		private   int price;
		private   int areaInSqft;
		private   int numberOfRooms;
		private   int numberOfBalcony;
		
		public Builder(int length,int breadth,int height) {
			this.breadth = breadth;
			this.length = length;
			this.height = height;
		}
		public Builder price(int val) {
			price = val;
			return this;
		}
		public Builder areaInSqft(int val) {
			areaInSqft = val;
			return this;
		}
		public Builder numberOfRooms(int val) {
			numberOfRooms = val;
			return this;
		}
		public Builder numberOfBalcony(int val) {
			numberOfBalcony = val;
			return this;
		}
		public HouseBuilderSolution build() {
			return new HouseBuilderSolution(this);
		}
	}
	
	public HouseBuilderSolution(Builder builder) {
		this.areaInSqft = builder.areaInSqft;
		this.breadth = builder.breadth;
		this.height = builder.height;
		this.length = builder.length;
		this.numberOfBalcony = builder.numberOfBalcony;
		this.numberOfRooms = builder.numberOfRooms;
		this.price = builder.price;
	}
	public static void main(String[] args) {
		HouseBuilderSolution houseBuilderSolution = new HouseBuilderSolution.Builder(0, 0, 0).areaInSqft(0).numberOfBalcony(0).numberOfRooms(0).build();
	}

}
