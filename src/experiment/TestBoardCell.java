package experiment;

import java.util.HashSet;
import java.util.Set;

public class TestBoardCell {
	private boolean occupied;
	private int column;
	private int row;
	private Set<TestBoardCell> Cells=new HashSet<TestBoardCell>();
	
	public TestBoardCell(int row,int column) {
		super();
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
		return Cells;
	}
	
}


