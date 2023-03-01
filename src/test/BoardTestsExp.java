package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import experiment.TestBoard;
import experiment.TestBoardCell;


public class BoardTestsExp {
	TestBoard board;
	
	
	@BeforeEach
	public void setUp() {
		board=new TestBoard();
		//System.out.print("hello");
	}

	@Test
	public void testAdjacency() {
		setUp();
		TestBoardCell cell= board.getCell(0,0);
		Set<TestBoardCell> testList = cell.getAdjList();
		Assert.assertTrue(testList.contains(board.getCell(1,0)));
		Assert.assertTrue(testList.contains(board.getCell(0,1)));
		Assert.assertEquals(2,testList.size());
	}
	@Test
		public void testAdjacency1() {
		setUp();
			TestBoardCell cell = board.getCell(3, 3);
			Set<TestBoardCell> testList = cell.getAdjList();
			Assert.assertTrue(testList.contains(board.getCell(2,3)));
			Assert.assertTrue(testList.contains(board.getCell(3,2)));
			Assert.assertEquals(2,testList.size());
	}
	@Test
	
	public void testAdjacency2() {
		setUp();
		TestBoardCell cell= board.getCell(1, 3);
		Set<TestBoardCell> testList = cell.getAdjList();
		//Assert.assertTrue(testList.contains(board.getCell(2,3)));
		//Assert.assertTrue(testList.contains(board.getCell(1,4)));
		Assert.assertEquals(3,testList.size()); // 2
	}
	
	@Test
	public void testAdjacency3() {
		setUp();
		TestBoardCell cell= board.getCell(3, 0);
		Set<TestBoardCell> testList = cell.getAdjList();
		//Assert.assertTrue(testList.contains(board.getCell(4,0)));
		//Assert.assertTrue(testList.contains(board.getCell(3,1)));
		Assert.assertEquals(2,testList.size());
	}
	@Test
	public void testAdjacency4() {
		setUp();
		TestBoardCell cell= board.getCell(2, 2);
		Set<TestBoardCell> testList = cell.getAdjList();
		//Assert.assertTrue(testList.contains(board.getCell(3,2)));
		//Assert.assertTrue(testList.contains(board.getCell(2,3)));
		Assert.assertEquals(2,testList.size()); 
	}
	@Test
	public void testTargetsNormal() {
		setUp();
		TestBoardCell cell = board.getCell(0, 0);
		board.calcTargets(cell,3);
		Set<TestBoardCell>targets=board.getTargets();
		Assert.assertEquals(6, targets.size()); 
		Assert.assertTrue(targets.contains(board.getCell(3, 0)));
		Assert.assertTrue(targets.contains(board.getCell(2, 1)));
		Assert.assertTrue(targets.contains(board.getCell(0, 1)));
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(0, 3)));
		Assert.assertTrue(targets.contains(board.getCell(1, 0)));
	}
	@Test
	public void testTargetsNormal1() {
		setUp();
		TestBoardCell cell = board.getCell(0, 3);
		board.calcTargets(cell,6);
		Set<TestBoardCell>targets=board.getTargets();
		Assert.assertTrue(targets.contains(board.getCell(0, 0)));
		Assert.assertTrue(targets.contains(board.getCell(2, 1)));
		Assert.assertTrue(targets.contains(board.getCell(0, 1)));
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(0, 3)));
		Assert.assertTrue(targets.contains(board.getCell(1, 0)));
	}
	@Test
	public void testTargetsNormal2() {
		setUp();
		TestBoardCell cell = board.getCell(2,1);
		board.calcTargets(cell,6);
		Set<TestBoardCell>targets=board.getTargets();
		Assert.assertTrue(targets.contains(board.getCell(0, 0)));
		Assert.assertTrue(targets.contains(board.getCell(3, 0)));
		Assert.assertTrue(targets.contains(board.getCell(0, 1)));
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(0, 3)));
		Assert.assertTrue(targets.contains(board.getCell(1, 0)));
		
	}
	@Test
	public void testTargetsNormal3() {
		setUp();
		TestBoardCell cell = board.getCell(3, 0);
		board.calcTargets(cell,3);
		Set<TestBoardCell>targets=board.getTargets();
		Assert.assertEquals(6, targets.size());
		Assert.assertTrue(targets.contains(board.getCell(0, 0)));
		Assert.assertTrue(targets.contains(board.getCell(2, 1)));
		Assert.assertTrue(targets.contains(board.getCell(0, 1)));
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(0, 3)));
		Assert.assertTrue(targets.contains(board.getCell(1, 0)));
	}
	@Test
	public void testTargetsNormal4() {
		setUp();
		TestBoardCell cell = board.getCell(1, 0);
		board.calcTargets(cell,3);
		Set<TestBoardCell>targets=board.getTargets();
		Assert.assertEquals(6, targets.size());
		Assert.assertTrue(targets.contains(board.getCell(3, 0)));
		Assert.assertTrue(targets.contains(board.getCell(2, 1)));
		Assert.assertTrue(targets.contains(board.getCell(0, 1)));
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(0, 3)));
		Assert.assertTrue(targets.contains(board.getCell(0, 0)));
	}
	@Test
	public void testTargetsNormal5() {
		setUp();
		TestBoardCell cell = board.getCell(1, 2);
		board.calcTargets(cell,3);
		Set<TestBoardCell>targets=board.getTargets();
		Assert.assertEquals(6, targets.size());
		Assert.assertTrue(targets.contains(board.getCell(3, 0)));
		Assert.assertTrue(targets.contains(board.getCell(2, 1)));
		Assert.assertTrue(targets.contains(board.getCell(0, 1)));
		Assert.assertTrue(targets.contains(board.getCell(0, 0)));
		Assert.assertTrue(targets.contains(board.getCell(0, 3)));
		Assert.assertTrue(targets.contains(board.getCell(1, 0)));
	}
	@Test
	public void testTargetsNormal6() {
		setUp();
		TestBoardCell cell = board.getCell(0, 1);
		board.calcTargets(cell,3);
		Set<TestBoardCell>targets=board.getTargets();
		Assert.assertEquals(6, targets.size());
		Assert.assertTrue(targets.contains(board.getCell(3, 0)));
		Assert.assertTrue(targets.contains(board.getCell(2, 1)));
		Assert.assertTrue(targets.contains(board.getCell(0, 0)));
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(0, 3)));
		Assert.assertTrue(targets.contains(board.getCell(1, 0)));
	}
	@Test
	public void testTargetsRoom() {
		setUp();
		TestBoardCell cell= board.getCell(0, 0);
		board.getCell(1,0).setIsRoom(true);
		board.getCell(0,1).setIsRoom(true);
		board.calcTargets(cell, 2);
		Set<TestBoardCell>targets=board.getTargets();
		assertEquals(6, targets.size());
		assertTrue(targets.contains(board.getCell(1, 0)));
		assertTrue(targets.contains(board.getCell(0, 1)));
		assertTrue(targets.contains(board.getCell(1, 1)));
		assertTrue(targets.contains(board.getCell(2, 0)));
		assertTrue(targets.contains(board.getCell(0, 2)));
		
		
	}
	@Test
	public void testTargetsRoom1() {
		setUp();
		TestBoardCell cell= board.getCell(3, 1);
		board.getCell(2,1).setIsRoom(true);
		board.getCell(3,0).setIsRoom(true);
		board.calcTargets(cell, 2);
		Set<TestBoardCell>targets=board.getTargets();
		assertEquals(6, targets.size());
		assertTrue(targets.contains(board.getCell(3, 3)));
		assertTrue(targets.contains(board.getCell(0, 1)));
		assertTrue(targets.contains(board.getCell(1, 1)));
		assertTrue(targets.contains(board.getCell(3, 3)));
		assertTrue(targets.contains(board.getCell(0, 3)));
		
		
	}
	
	@Test
	public void testTargetsOccupied() {
		setUp();
		TestBoardCell cell= board.getCell(0, 0);
		board.getCell(1,0).setOccupied(true);
		board.getCell(0,1).setOccupied(true);
		board.calcTargets(cell, 5);
		Set<TestBoardCell>targets=board.getTargets();
		assertEquals(0,targets.size());
		
	}
	@Test
	public void testTargetsOccupied1() {
		setUp();
		TestBoardCell cell= board.getCell(3, 3);
		board.getCell(2,3).setOccupied(true);
		board.getCell(3,2).setOccupied(true);
		board.calcTargets(cell, 2);
		Set<TestBoardCell>targets=board.getTargets();
		assertEquals(0,targets.size());
		
	}
	
	@Test
	public void testTargetsMixed() {
		setUp();
		board.getCell(0, 2).setOccupied(true);
		board.getCell(1, 2).setIsRoom(true);
		TestBoardCell cell =board.getCell(0, 3);
		board.calcTargets(cell,3);
		Set<TestBoardCell> targets =board.getTargets();
		Assert.assertEquals(3, targets.size());
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(2, 2)));
		Assert.assertTrue(targets.contains(board.getCell(3, 3)));
		
	}
	@Test
	public void testTargetsMixed1() {
		setUp();
		board.getCell(0, 1).setOccupied(true);
		board.getCell(1, 0).setIsRoom(true);
		TestBoardCell cell =board.getCell(1, 1);
		board.calcTargets(cell,3);
		Set<TestBoardCell> targets =board.getTargets();
		Assert.assertEquals(7, targets.size());
		Assert.assertTrue(targets.contains(board.getCell(1, 2)));
		Assert.assertTrue(targets.contains(board.getCell(2, 2)));
		Assert.assertTrue(targets.contains(board.getCell(3, 3)));
		Assert.assertTrue(targets.contains(board.getCell(3, 0)));
		Assert.assertTrue(targets.contains(board.getCell(2, 1)));
		Assert.assertTrue(targets.contains(board.getCell(0, 2)));
		Assert.assertTrue(targets.contains(board.getCell(2, 0)));
		Assert.assertTrue(targets.contains(board.getCell(0, 3)));
		Assert.assertTrue(targets.contains(board.getCell(2, 2)));
		
	}
	
	
	
}
