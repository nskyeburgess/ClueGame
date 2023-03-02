package clueGame;

import java.util.HashSet;
import java.util.Set;

import experiment.TestBoardCell;

public class BoardCell {
	private boolean occupied;
	private boolean room;
	private boolean roomLabel;
	private boolean roomCenter;
	private int column;
	private int row;
	char secretPassage = 'c';
	char inital='b';
	private Set<BoardCell> Cells=new HashSet<BoardCell>();
	
	public void BoardCell(int row,int column) {
		this.row = row;
		this.column = column;
		this.occupied = false;
		this.room = false;
		this.roomLabel =false;
		this.roomCenter=false;
		
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
	public void addAdjacency(BoardCell cell) {
		this.Cells.add(cell);		
	 }
	 
	//gets cells thats adjacent
	public Set<BoardCell> getAdjList() {
		
		return Cells;
	}

	public Object[] getDoorDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	public char getSecretPassage() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isRoomCenter() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isLabel() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isDoorway() {
		// TODO Auto-generated method stub
		return false;
	}

}
