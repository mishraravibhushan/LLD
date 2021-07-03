package jigsaw;

import java.util.LinkedList;

public class Puzzle {
	private LinkedList<Piece> pieces;
	private Piece[][] solution;
	private int size;
	
	public Puzzle(int size, LinkedList<Piece> pieces) {
		
	}
	
	/*
	 * Put piece into the solution turn it appropriately,
	 * and remove from list
	 */
	private void setEdgeInSolution(LinkedList<Piece> pieces,Edge edge
			,int row,int column,Orientation orientation ) {
		Piece piece = edge.getParentPiece();
		piece.setEdgeAsOrientation(edge, orientation);
		pieces.remove();
		solution[row][column] = piece;
	}
	/*
	 * Find the matching piece in piencesToSearch and insert it 
	 * at row,column
	 */
	private boolean fitNextEdge(LinkedList<Piece> piecesToSearch,int row,int col) {
		if(row == 0 && col == 0) {
			/*
			 * On top left corner just put in a piece
			 */
			Piece pieceToSearch = piecesToSearch.remove();
			orientTopLeftCorner(pieceToSearch);
		}else {
			/*
			 * Get the right edge and list to match
			 */
			Piece pieceToMatch = col == 0 ? solution[row-1][0]:solution[row][col-1];
			Orientation orientationToMatch = col == 0 ? Orientation.BOTTOM:Orientation.RIGHT;
			Edge edgeToMatch = pieceToMatch.getEdgeWithOrientation(orientationToMatch);
			/*
			 * Get Matching edge
			 */
			Edge edge = gettMatchingEdge(edgeToMatch, piecesToSearch);
			if(edge == null) {
				return false;
			}
			/*
			 * Insert piece and edge
			 */
			Orientation orientation = orientationToMatch.getOpposite();
			setEdgeInSolution(piecesToSearch, edge, row, col, orientation);
			
		}
		return true;
	}
	
	private Edge gettMatchingEdge(Edge edgeToMatch,LinkedList<Piece> pieceToSearch) {
		return new Edge();
	}
	
	private void orientTopLeftCorner(Piece piece) {
		
	}
	
	/*
	 * Solve puzzle
	 */
	public boolean solve() {
		return true;
	}

}
