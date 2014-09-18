package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    
    @Test
	public void testMarkCenterX() {
		TicTacToe game = new TicTacToe();
		game.setMark(1, 1);
		assertEquals("X", game.getMark(1, 1));
	}
	
    @Test
	public void testMarkCenterXThenBottomRightO() {
		TicTacToe game = new TicTacToe();
		game.setMark(1, 1);
		assertEquals("X", game.getMark(1, 1));
		game.setMark(2, 2);
		assertEquals("O", game.getMark(2, 2));
	}
	
    @Test
	public void testMarkSameSpotTwice() {
		TicTacToe game = new TicTacToe();
		game.setMark(1, 1);
		assertEquals("X", game.getMark(1, 1));
		game.setMark(1, 1);
		assertEquals("X", game.getMark(1, 1));
	}
}
