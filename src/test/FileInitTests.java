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

        // Sets the amount of rows in columns in our board

        public static final int NUM_ROWS = 28;

        public static final int NUM_COLUMNS = 27;

        private static Board board;

        @BeforeAll

        public static void setUp() {

                // Gets initiated board

                board = Board.getInstance();

                // Gets our orignial files for our clue board

                board.setConfigFiles("ClueLayout.csv", "ClueSetup.txt");

                // Initialize our files

                board.initialize();

        }

        @Test

        public void testRoomLabels() {

                // Retrives our new girl rooms

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

        @Test

        public void testBoardDimensions() {

                // Checks rows and columns

                assertEquals(NUM_ROWS, board.getNumRows());

                assertEquals(NUM_COLUMNS, board.getNumColumns());

        }

        @Test

        //checks to see if our doors are in the correct place

        public void FourDoorDirections() {

                BoardCell cell = board.getCell(5, 7); //8,13

                assertTrue(cell.isDoorway());

                assertEquals(DoorDirection.UP, cell.getDoorDirection()); // LEFT

                cell = board.getCell(10, 6); //11,7

                assertTrue(cell.isDoorway());

                assertEquals(DoorDirection.LEFT, cell.getDoorDirection());//UP

                cell = board.getCell(17, 5); //6,8

                assertTrue(cell.isDoorway());

                assertEquals(DoorDirection.DOWN, cell.getDoorDirection()); //RIGHT

                cell = board.getCell(22, 19); //12,21

                assertTrue(cell.isDoorway());

                assertEquals(DoorDirection.RIGHT, cell.getDoorDirection());//DOWN

               

               

                // This is not a door so it should fail

                cell = board.getCell(14, 18);

                assertFalse(cell.isDoorway());

        }

        //Makes sure the door amount is right

        @Test

        public void testNumberOfDoorways() {

                int numDoors = 0;

                for (int row = 0; row < board.getNumRows(); row++)

                       for (int col = 0; col < board.getNumColumns(); col++) {

                               BoardCell cell = board.getCell(row, col);

                               if (cell.isDoorway())

                                       numDoors++;

                       }

                Assert.assertEquals(10, numDoors);

        }

        @Test

        public void testRooms() {

                // just test a standard room location

                BoardCell cell = board.getCell( 9, 2);

                Room room = board.getRoom( cell ) ;

                assertTrue( room != null );

                assertEquals( room.getName(), "Jess's Room" ) ;

                assertFalse( cell.isLabel() );

                assertFalse( cell.isRoomCenter() ) ;

                assertFalse( cell.isDoorway()) ;

                // this is a label cell to test

                cell = board.getCell(2, 19);

                room = board.getRoom( cell ) ;

                assertTrue( room != null );

                assertEquals( room.getName(), "Ceci's apartment" ) ;

                assertTrue( cell.isLabel() );

                assertTrue( room.getLabelCell() == cell );

                // this is a room center cell to test

                cell = board.getCell(23, 4);

                room = board.getRoom( cell ) ;

                assertTrue( room != null );

                assertEquals( room.getName(), "Winston's Room" ) ;

                assertTrue( cell.isRoomCenter() );

                assertTrue( room.getCenterCell() == cell );

                // this is a secret passage test

                cell = board.getCell(22, 27);

                room = board.getRoom( cell ) ;

                assertTrue( room != null );

                assertEquals( room.getName(), "Shmmit's Room" ) ;

                assertTrue( cell.getSecretPassage() == 'C' );

                // test a to see if the cells the hallway

                cell = board.getCell(19, 13);

                room = board.getRoom( cell ) ;

                assertTrue( room != null );

                assertEquals( room.getName(), "Hallway" ) ;

                assertFalse( cell.isRoomCenter() );

                assertFalse( cell.isLabel() );

                // test a board is unused

                cell = board.getCell(28, 1);

                room = board.getRoom( cell ) ;

                assertTrue( room != null );

                assertEquals( room.getName(), "Unused" ) ;

                assertFalse( cell.isRoomCenter() );

                assertFalse( cell.isLabel() );

        }

}
