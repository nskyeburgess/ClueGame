package clueGame;

import java.util.HashSet;

import clueGame.DoorDirection;

import java.util.Set;

import experiment.TestBoardCell;

//getters like getAdjLssti(), getDoorDirection(), getINitial(), getSeceretPassage()

public class BoardCell {

	private boolean occupied;

	private boolean room;

	private boolean roomLabel;

	private boolean roomCenter;

	private boolean doorway;

	private int column;

	private int row;

	private Room r;

	private char secretPassage;

	private String inital;

	private DoorDirection doorDirection;

	private Set<BoardCell> Cells=new HashSet<BoardCell>();

	public BoardCell(int row,int column, Room r) {

		this.row = row;

		this.column = column;

		this.occupied = false;

		this.room = false;

		this.roomLabel =false;

		this.roomCenter=false;



		doorDirection = DoorDirection.NONE;

		this.r = new Room();

	}

	//getter and setters for row and column

	public int getColumn() {

		return column;

	}

	//public void setColumn(int column) {

		//this.column = column;

	//}

//	public int getRow() {
//
//		return row;
//
//	}

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

	/*public Set<BoardCell> getDoorDirection() {

return Cells;

}*/

	public void setDoorDirection(DoorDirection dir) {

		//this.doorDirection = DoorDirection.dir();

		this.doorDirection = dir;

	}

	public DoorDirection getDoorDirection() {

		return doorDirection;

	}

	public void setInitial(String inital) {

		this.inital = inital;

	}

	public String getInital() {

		return inital;

	}

	public char getSecretPassage() {

		return secretPassage;

	}

	public void setRoomCenter(boolean b) {

		this.roomCenter = b;

	}

	public boolean isRoomCenter() {

		return roomCenter;

	}

	public boolean isLabel() {

		return roomLabel;

	}

	public boolean isDoorway() {

		return doorway;

	}

	public void setDoorway(boolean b) {

		this.doorway = b;

	}

}
