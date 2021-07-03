package jigsaw;

public class Edge {
	
	private Shape shape;
	private Piece parentPiece;
	
	public Edge() {
		
	}
	public Edge(Shape shape) {
		
	}
	public boolean fitsWith(Edge edge) {
		return true;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public Piece getParentPiece() {
		return parentPiece;
	}
	public void setParentPiece(Piece parentPiece) {
		this.parentPiece = parentPiece;
	}

}
