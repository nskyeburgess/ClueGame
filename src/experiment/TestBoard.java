package experiment;


import java.util.HashSet;
import java.util.Set;

public class TestBoard {
	private Set<TestBoardCell> visited = new HashSet<TestBoardCell>();
	private Set<TestBoardCell> targets = new HashSet<TestBoardCell>();
	private TestBoardCell[][] grid;
	final static int COLS = 4;
	final static int ROWS = 4;
	
	// empty constructor
	// check adjacency here
	public TestBoard() {
		grid = new TestBoardCell[COLS][ROWS];
		
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLS; j++) {
				grid[i][j] = new TestBoardCell(i,j);
				
				}
			}
		
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLS; j++) {
				
				//check above
				if(j - 1 >= 0 ) {
					if(grid[i][j-1].getOccupied() == false)
						grid[i][j].addAdjacency(grid[i][j-1]);
				}
				// check below
				if(j + 1 < COLS) {
					if(grid[i][j+1].getOccupied() == false)
						grid[i][j].addAdjacency(grid[i][j+1]);
				}
				//check left
				if(i - 1 >= 0) {
					if(grid[i-1][j].getOccupied() == false)
						grid[i][j].addAdjacency(grid[i-1][j]);
				}
				//check right
				if(i + 1 < ROWS) {
					if(grid[i+1][j].getOccupied() == false)
						grid[i][j].addAdjacency(grid[i+1][j]);
				}
			}
		}
	}
	
	// calcs legal targets for a move from startCell of length pathlength
	public void calcTargets( TestBoardCell startCell, int pathlength) {
		//visited.add(startCell);
		int i = startCell.getRow();
		int j = startCell.getColumn();
		visited.add(grid[i][j]);
		
		// recursive function
		//findAllTargets(startCell,pathlength);
		findAllTargets(grid[i][j], pathlength);
		
		
	}
	
	
	// recursive function for calcTargets
	public void findAllTargets(TestBoardCell startCell, int pathlength) {
		//Set<TestBoardCell> adjCells = startCell.getAdjList();
		int k = startCell.getRow();
		int l = startCell.getColumn();
		Set<TestBoardCell> adjCells = grid[k][l].getAdjList();
		
		
		
		//loop through adjCells
		for(TestBoardCell adjC : adjCells) {
			int i = adjC.getRow();
			int j = adjC.getColumn();
			//replaced adjC with grid[i][j]
			if(visited.contains(grid[i][j])) {
				continue;
			}
			visited.add(grid[i][j]);
			if(pathlength == 1 ) { 
				targets.add(grid[i][j]);
			}
			else {
				findAllTargets(grid[i][j], pathlength -1);
			}
			visited.remove(grid[i][j]);
			
		}
	}
	
	

	// returns the cell from the board at row,col
	public TestBoardCell getCell(int row, int col) {
		//TestBoardCell cell = new TestBoardCell(row,col);
		//cell.getAdjList();
		
		
		//return cell;
		return grid[row][col];
	}
	
	// gets targets created by calcTargets()
	public Set<TestBoardCell> getTargets() {
		
		return targets;
	}


}
