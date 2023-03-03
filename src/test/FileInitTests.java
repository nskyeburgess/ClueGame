package test;

import static org.junit.Assert.*;
import clueGame.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clueGame.Board;
import clueGame.BoardCell;
import clueGame.DoorDirection;
import clueGame.Room;

public class FileInitTests {
// Constants that I will use to test whether the file was loaded correctly
	public static final int NUM_ROWS = 28;
	public static final int NUM_COLUMNS = 27;	
	
	private static Board board;

	@BeforeAll
	public static void setUp() {
		// Board is singleton, get the only instance
		board = Board.getInstance();
		// set the file names to use my config files
		board.setConfigFiles("ClueLayout306.csv", "ClueSetup306.txt");
		// Initialize will load BOTH config files
		board.initialize();
	}
	
	@Test
	public void testRoomLabels() {
		// To ensure data is correctly loaded, test retrieving a few rooms
		// from the hash, including the first and last in the file and a few others
		assertEquals("Jess's Room", board.getRoom('J').getName() );
		assertEquals("Winston's Room", board.getRoom('W').getName() );
		assertEquals("Nick's Room", board.getRoom('N').getName() );
		assertEquals("Shmmit's Room", board.getRoom('S').getName() );
		assertEquals("Living Room", board.getRoom('L').getName() );
		assertEquals("Kitchen", board.getRoom('K').getName() );
		assertEquals("Bathroom", board.getRoom('B').getName() );
		assertEquals("Ceci's apartment", board.getRoom('C').getName() );
		assertEquals("Roof top", board.getRoom('R').getName() );
		
	}
	
}
