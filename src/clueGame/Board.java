package clueGame;

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
	
	
	public void loadSetupConfig() {
		
	}
	
	public void loadLayoutConfig() {
		
	}
	
	

}
