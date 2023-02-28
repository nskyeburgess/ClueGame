package test;


public class BoardTestsExp {
	TestBoard board;
	@BeforeEach
	public void setUp() {
		board=new TestBoard();
	}

	@Test
	public void testAdjacency() {
		TestBoardCell cell= board.getCell(0,0);
		Set<TestBoardCell> testList = cell.getAdjList();
		Assert.assertTrue(testList.contains(board.getCell(1,0)));
		Assert.assertTrue(testList.contains(board.getCell(0,1)));
		Assert.assertEquals(2,testList.size());
		
		
		
	}
	
}
