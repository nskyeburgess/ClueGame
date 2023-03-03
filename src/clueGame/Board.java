package clueGame;
import java.util.HashSet;
import java.util.Set;

import experiment.TestBoardCell;
import java.util.Map;

public class Board {
	private BoardCell[][] grid;
	private int numRows;
	private int numColumns;
	private String layoutConfigFile;
	private String setupConfigFile;
	private Map<Character, Room> roomMap;
	//private static Board theInstance; 
	
	/*
     * variable and methods used for singleton pattern
     */
     private static Board theInstance = new Board();
     // constructor is private to ensure only one can be created
     private Board() {
            super() ;
     }
     // this method returns the only Board
     public static Board getInstance() {
            return theInstance;
     }
	
    /*
     * initialize the board (since we are using singleton pattern)
     */
	public void initalize(BoardCell[][] grid, int numRows, int numColumns, String layoutConfigFile, String setupConfigFile,
			Map<Character, Room> roomMap) {
		this.grid = grid;
		this.numRows = numRows;
		this.numColumns = numColumns;
		this.layoutConfigFile = layoutConfigFile;
		this.setupConfigFile = setupConfigFile;
		this.roomMap = roomMap;
	}
	
	
     public void initialize()
     {
     }
	public void setConfigFiles(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	public void loadSetupConfig() {
		// TODO Auto-generated method stub
		
	}
	public void loadLayoutConfig() {
		// TODO Auto-generated method stub
		
	}
	public Room getRoom(char c) {
		// TODO Auto-generated method stub
		return new Room();
	}
	public int getNumColumns() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getNumRows() {
		// TODO Auto-generated method stub
		return 0;
	}
	public BoardCell getCell(int i, int j) {
		// TODO Auto-generated method stub
		return new BoardCell(0, 0);
	}
	public Room getRoom(BoardCell cell) {
		// TODO Auto-generated method stub
		return null;
	}
		
				
			

}
