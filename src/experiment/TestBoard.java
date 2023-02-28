package experiment;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestBoard {
	private Set<TestBoardCell> visited = new HashSet<TestBoardCell>();
	private Set<TestBoardCell> targets = new HashSet<TestBoardCell>();
	// empty constructor
	public TestBoard() {
		
	}
	
	// calcs legal targets for a move from startCell of length pathlength
	public void calcTargets( TestBoardCell startCell, int pathlength) {
		//Set<TestBoardCell> visited = new HashSet<TestBoardCell>();
		//Set<TestBoardCell> targets = new HashSet<TestBoardCell>();
		visited.add(startCell);
		findAllTargets(startCell,pathlength);
		
		
	}
	
	
	// recursive function for calcTargets
	public void findAllTargets(TestBoardCell startCell, int pathlength) {
		Set<TestBoardCell> adjCells = getAdjList(startCell);
		//loop through adjCells
		for(TestBoardCell adjC : adjCells) {
			if(visited.contains(adjC)) {
				continue;
			}
			visited.add(adjC);
			if(pathlength == 1) {
				targets.add(adjC);
			}
			else {
				findAllTargets(adjC, pathlength -1);
			}
			visited.remove(adjC);
			
		}
	}
	
	// returns the cell from the board at row,col
	TestBoardCell getCell(int row, int col) {
		TestBoardCell cell = null;
		// set cell to row,col
		
		return cell;
	}
	
	// gets targets created by calcTargets()
	Set<TestBoardCell> getTargets() {
		
		return null;
	}


}
