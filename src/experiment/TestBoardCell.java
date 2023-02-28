package experiment;

import java.util.Set;

public class TestBoardCell {
	private boolean occupied;
	private int column;
	private int row;
	public TestBoardCell(int row,int column) {
		this.row = row;
		this.column = column;
		this.occupied = true;
		
	}
	 void addAdjacency(TestBoardCell cell) {
		 
	 }
	 
	 
	 
	 void setRoom(boolean room ) {
	}
	 
	 boolean isRoom() {
		 return false;
	 }
	 
	 public void setOccupied(boolean occupied) {
	}
	 
	 boolean getOccupied() {
		return false;
	}
	
	public void setIsRoom(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public Set<TestBoardCell> getAdjList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


