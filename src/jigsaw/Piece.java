package jigsaw;

import java.util.HashMap;

public class Piece {
	private HashMap<Orientation, Edge> edges = new HashMap<Orientation, Edge>();
	public Piece(Edge[] edgeList) {
		
	}
	/*
	 * Rotate edges by numberRotations
	 */
	public void rotateEdgesBy(int numberRotations) {
		
	}
	
	public void setEdgeAsOrientation(Edge edge,Orientation orientation) {
		
	}
	
	public Edge getEdgeWithOrientation(Orientation orientation) {
		return new Edge();
	}
	
	public boolean isCorner() {
		return true;
	}
	public boolean isBorder() {
		return true;
	}
	public HashMap<Orientation, Edge> getEdges() {
		return edges;
	}
	public void setEdges(HashMap<Orientation, Edge> edges) {
		this.edges = edges;
	}
	

}
