/* This code implements the factors needed to make a cell that the player can walk on 
 * and be aware of the cells next to it
 */

package experiment;

import java.util.HashSet;
import java.util.Set;

public class TestBoardCell {
	private boolean occupied;
	private boolean room;
	private int column;
	private int row;
	private Set<TestBoardCell> Cells=new HashSet<TestBoardCell>();
	
	public TestBoardCell(int row,int column) {
		super();
		this.row = row;
		this.column = column;
		this.occupied = false;
		this.room = false;	
		
	}
	
	//getter and setters for row and column
	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	
	// setter to add a cell to this cells adjacency list
	public void addAdjacency(TestBoardCell cell) {
		this.Cells.add(cell);		
	 }
	 
	//if player is in room t/f
	public void setRoom(boolean r ) {
		 room = r;
	}
	 
	 boolean isRoom() {
		 return room;
	 }
	 
	 public void setOccupied(boolean occ) {
		 occupied = occ;
	}
	 
	 boolean getOccupied() {
		return occupied;
	}
	
	public void setIsRoom(boolean b) {
		room = b;
		
	}
	//gets cells thats adjacent
	public Set<TestBoardCell> getAdjList() {
		
		return Cells;
	}
	
}



