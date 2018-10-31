package nl.tudelft.jpacman.board;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;


public class JPFBoardTest {

		private nl.tudelft.jpacman.board.Board nl_tudelft_jpacman_board_board;
	    private final Square[][] grid = {
	            { mock(Square.class), mock(Square.class), mock(Square.class) },
	            { mock(Square.class), mock(Square.class), mock(Square.class) },
	        };
		@Before
		public void setUp() throws Exception {

		    nl_tudelft_jpacman_board_board = new Board(grid);

		}

		@Test
		public void test0() {
			nl_tudelft_jpacman_board_board.withinBorders(0,0);
		}

		@Test
		public void test1() {
			nl_tudelft_jpacman_board_board.withinBorders(0,3);
		}

		@Test
		public void test2() {
			nl_tudelft_jpacman_board_board.withinBorders(2,0);
		}

		@Test
		public void test3() {
			nl_tudelft_jpacman_board_board.withinBorders(2,3);
		}
		@Test
		public void test4() {
			nl_tudelft_jpacman_board_board.withinBorders(10,3);
		}

		@Test
		public void test4() {
			nl_tudelft_jpacman_board_board.withinBorders(2,10);
		}

		@Test
		public void test4() {
			nl_tudelft_jpacman_board_board.withinBorders(10,10);
		}


}
