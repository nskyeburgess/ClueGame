package clueGame;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import experiment.TestBoardCell;
import java.util.Map;
import java.util.Scanner;
//calAdjecencies(), calcTargets(startCell,pathlength), ...

public class Board {
	private BoardCell[][] grid;
	private int numRows;
	private int numColumns;
	private String layoutConfigFile;
	private String setupConfigFile;
	//private Map<Character, Room> roomMap;
	private Map<String, Room> roomMap;
	
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
			Map<String, Room> roomMap) {
		this.grid = grid;
		this.numRows = numRows;
		this.numColumns = numColumns;
		this.layoutConfigFile = layoutConfigFile;
		this.setupConfigFile = setupConfigFile;
		this.roomMap = roomMap;
	}
	
	public void initialize() //throws BadConfigFormatException
	{
		
		
		try {
			loadSetupConfig();//added
			//loadLayoutConfig();//added
		}
		catch (BadConfigFormatException e) {
			System.out.print("BadConfig1   ");
		}
		catch( FileNotFoundException e) {
			System.out.println("filenotfound1  ");
		}
		try {
 		//loadSetupConfig();//added
		loadLayoutConfig();//added
		}
		catch (BadConfigFormatException e) {
			System.out.print("BadConfig2  ");
		}
		catch( FileNotFoundException e) {
			System.out.println("filenotfound2  ");
		}
			
		
		
	}
	
	public void setConfigFiles(String string, String string2) {
		layoutConfigFile = "ClueInitFiles/data/" + string;
		setupConfigFile = "ClueInitFiles/data/" + string2;
		
		
	}
	
	// get variables from text files for each character
	// set up roomMap
	public void loadSetupConfig() throws BadConfigFormatException, FileNotFoundException{
		FileReader reader = new FileReader(setupConfigFile);
		Scanner in = new Scanner(reader);
		ArrayList<String> fileList = new ArrayList<String>();
		while(in.hasNext()) {
			fileList.add(in.nextLine());
		}
		in.close();
		
		// setting up roomMap
		// check 0 is 'Room' or 'space', throw
		for(int i = 0; i < fileList.size();i++) {
			String line = fileList.get(i);
			String[] lineSplit = line.split(",");
			if(lineSplit[0] != "Room" || lineSplit[0] != "Space" )
				throw new BadConfigFormatException();
			if(lineSplit.length == 3) {
				Room r = new Room(lineSplit[2]);
				//r.setName(lineSplit[2]);
				roomMap.put(lineSplit[1], r);
			}
		}
		
		
	}
	
	// build grid
	//make sure each initial is in the map
	public void loadLayoutConfig() throws BadConfigFormatException, FileNotFoundException{
		//filereader
		FileReader reader = new FileReader(layoutConfigFile);
		Scanner in = new Scanner(reader);
		ArrayList<String> fileList = new ArrayList<String>();
		while(in.hasNext()) {
			fileList.add(in.nextLine());
			
		}
		in.close();
		
		//check each row has the same num of cols
		numRows = fileList.size();
		//String[] Columns = fileList.get(0).split(",");
		//numColumns = Columns[0].length();
		numColumns = fileList.get(0).split(",").length;
		
		grid = new BoardCell[numRows][numColumns];
		
		for(int i = 0; i < numRows; i++) {
			String line = fileList.get(i);
			String[] lineSplit = line.split(",");
			for(int j = 0; j < numColumns; j++) {
				
				if(lineSplit.length != numColumns) {
					System.out.println("ERRRRRR" + lineSplit.length );
					System.out.println(numRows + "   " + numColumns);
					throw new BadConfigFormatException();
				}
				// get room from the letter and create a board cell on grid
				String init = lineSplit[j];
				Room room = roomMap.get(init);
				
				grid[i][j] = new BoardCell(i,j, room);
				
				
				if(init.length() == 2)
				{
					//special characters
				}
				else 
				{
					grid[i][j].setInitial(init);
				}
			}
		}
	}
	
	//public Room getRoom(char c)
	public Room getRoom(char c) {
		Room r = roomMap.get(c);
		//return new Room();
		return r;
	}
	
	public int getNumColumns() {
		return numColumns;
	}
	
	public int getNumRows() {
		return numRows;
	}
	
	public BoardCell getCell(int i, int j) {
		//return new BoardCell(0, 0);
		return grid[i][j];
	}
	
	public Room getRoom(BoardCell cell) {
		String initial = cell.getInital();
		Room r = roomMap.get(1);
		return r;
	}
}

